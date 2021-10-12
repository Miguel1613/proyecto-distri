package com.udistrital.ws.entity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.ws.entity.dao.IClienteDao;
import com.udistrital.ws.entity.dao.IEstadoMesaDao;
import com.udistrital.ws.entity.dao.IReservaDao;
import com.udistrital.ws.entity.dao.IReservaMesaDao;
import com.udistrital.ws.entity.models.ReservaFinal;
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
	
	@Override
	public String InsertReserva(ReservaFinal reserva) {
		// Validar existencia de Cliente
		String mensaje = "variables de entrada: \n -nombre: " + reserva.getNombre() + "\n -celular: " + reserva.getCelular();
		return mensaje;
		
	}

}
