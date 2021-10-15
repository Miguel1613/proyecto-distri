package com.udistrital.ws.entity.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.ws.entity.dao.IReservaDao;
import com.udistrital.ws.entity.models.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService{
@Autowired
private IReservaDao reservaDao;
	@Override
	public Reserva get(long codigo_reserva) {
		return reservaDao.findById(codigo_reserva).get();
	}

	@Override
	public List<Reserva> getAll() {
		return (List<Reserva>) reservaDao.findAll();
	}
	
	@Override
	public void post(Reserva reserva) {
		reservaDao.save(reserva);
	}

	@Override
	public void put(Reserva reserva, long id) {
		reservaDao.findById(id).ifPresent((x)->{
			reserva.setCodigo_reserva(id);
			reservaDao.save(reserva);
		});
		
	}

	@Override
	public void delete(long codigo_reserva) {
		reservaDao.deleteById(codigo_reserva);
	}

	@Override
	public List<Reserva> getbycedula(long cedula) {
		List<Reserva> reservas = reservaDao.findbycedula(cedula);
		return reservas;
	}

}
