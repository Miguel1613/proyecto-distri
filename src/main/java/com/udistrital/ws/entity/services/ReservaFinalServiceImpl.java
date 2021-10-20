package com.udistrital.ws.entity.services;

import java.sql.Timestamp;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.ws.entity.dao.IClienteDao;
import com.udistrital.ws.entity.dao.IEstadoMesaDao;
import com.udistrital.ws.entity.dao.IReservaDao;
import com.udistrital.ws.entity.dao.IReservaMesaDao;
import com.udistrital.ws.entity.models.Cliente;
import com.udistrital.ws.entity.models.EstadoMesa;
import com.udistrital.ws.entity.models.Reserva;
import com.udistrital.ws.entity.models.ReservaFinal;
import com.udistrital.ws.entity.models.ReservaMesa;
@Service
public class ReservaFinalServiceImpl implements IReservaFinalService {
	@Autowired
	private IReservaMesaDao reservaMesaDao;
	@Autowired
	private IClienteDao clienteDao;
	@Autowired
	private IReservaDao reservaDao;
	@Autowired
	private IEstadoMesaDao estadoMesaDao;
	
	@Autowired
	IClienteService clienteService;
	
	@SuppressWarnings({ "null", "deprecation" })
	@Override
	public String InsertReserva(ReservaFinal reserva) {
		// Validar existencia de Cliente
		String mensaje = null;
		if (reserva.getFecha_inicio().getHours() > 21 || reserva.getFecha_inicio().getHours() < 8  ) {
			mensaje = "{\"id_mesa\":\"N/A\",\"status\":\"Horario de reserva invalido recuerde que puede reservar desde las 8 am hasta las 9 pm\"}";
		}
		else {
		String id_mesa = estadoMesaDao.findmesa(reserva.getNumero_personas(), reserva.getFecha_inicio(), reserva.getFecha_fin());
		if (id_mesa == null) {
			mensaje = "{\"id_mesa\":\"N/A\",\"status\":\"No hay mesa disponible para el numero de personas requerido en la hora y fecha indicadas, por favor re agendar\"}";
		}
		else {
		Optional<Cliente> cliente = clienteDao.findById(reserva.getCedula());
		if (cliente.isPresent()) {
			cliente.get();
			Cliente nuevo_cliente = cliente.get();
			if(nuevo_cliente.getCelular() != reserva.getCelular() ) {
				clienteDao.updateCelular(reserva.getCedula(), reserva.getCelular());
			}
			if(nuevo_cliente.getEmail() != reserva.getEmail() ) {
				clienteDao.updateEmail(reserva.getCedula(), reserva.getEmail());
			}
			if(nuevo_cliente.getNombre() != reserva.getNombre() ) {
				clienteDao.updateNombre(reserva.getCedula(), reserva.getNombre());
			}
		}
		else {
			Cliente nuevo_cliente = new Cliente();
			nuevo_cliente.setCedula(reserva.getCedula());
			nuevo_cliente.setCelular(reserva.getCelular());
			nuevo_cliente.setEmail(reserva.getEmail());
			nuevo_cliente.setNombre(reserva.getNombre());
			clienteDao.save(nuevo_cliente);
		}
		//insertar reserva
		Reserva reserv = new Reserva();
		reserv.setCedula(reserva.getCedula());
		reserv.setEs_fumador(reserva.getEs_fumador());
		reserv.setFecha_reserva(reserva.getFecha_inicio());
		reserv.setId_plan(reserva.getId_plan());
		reserv.setId_sede(reserva.getId_sede());
		reserv.setNumero_personas(reserva.getNumero_personas());
		reserv.setTiene_plan(reserva.getTiene_plan());
		reservaDao.save(reserv);
		//insert reserva-mesa
		ReservaMesa reservaMesa = new ReservaMesa();
		reservaMesa.setId_mesa(id_mesa);
		reservaMesa.setFecha_inicio(reserva.getFecha_inicio());
		reservaMesa.setFecha_fin(reserva.getFecha_fin());
		reservaMesaDao.save(reservaMesa);
		//insert estado-mesa
		EstadoMesa estadoMesa = new EstadoMesa();
		estadoMesa.setFecha_fin(reserva.getFecha_fin());
		estadoMesa.setFecha_inicio(reserva.getFecha_inicio());
		estadoMesa.setId_estado(reserva.getId_estado());
		estadoMesa.setId_mesa(id_mesa);
		estadoMesaDao.save(estadoMesa);
		mensaje = "{\"id_mesa\":"+id_mesa+",\"status\":\"La reserva fue exitosa, muchas gracias por preferirnos.\"}";
		}
		}
		return mensaje;
		
	}

	@Override
	public String DeleteReserva(long codigo_reserva) {
		String mensaje = null;
	
	
	try
	{
	Reserva reserva =	reservaDao.findById(codigo_reserva).get();
	 Timestamp fecha_reserva = reserva.getFecha_reserva();
	String id_mesa = reservaMesaDao.findidmesa(codigo_reserva);
	estadoMesaDao.deleteEstadoMesa(fecha_reserva, id_mesa);
	reservaMesaDao.deleteReservaMesa(codigo_reserva);
	reservaDao.deleteById(codigo_reserva);
		mensaje = "{\"status\":\"La reserva ha sido cancelada con exito.\"}";
		
		}
		catch (Exception e)  {
			mensaje = "{\"status\":\"La reserva no aparece en base de datos.\"}";
		}
		return mensaje;
	}

}
