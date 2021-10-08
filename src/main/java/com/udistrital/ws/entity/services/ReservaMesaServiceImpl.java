package com.udistrital.ws.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.ws.entity.dao.IReservaMesaDao;
import com.udistrital.ws.entity.models.ReservaMesa;
import com.udistrital.ws.entity.models.ReservaMesaId;
@Service
public class ReservaMesaServiceImpl implements IReservaMesaService {
	@Autowired
	private IReservaMesaDao reservaMesaDao;
	@Override
	public ReservaMesa get(ReservaMesaId reservaMesaId) {
		return reservaMesaDao.findById(reservaMesaId).get();
	}

	@Override
	public List<ReservaMesa> getAll() {
		return (List<ReservaMesa>) reservaMesaDao.findAll();
	}

	@Override
	public void post(ReservaMesa reservaMesa) {
		reservaMesaDao.save(reservaMesa);
	}

	

	@Override
	public void delete(ReservaMesaId reservaMesaId) {
		reservaMesaDao.deleteById(reservaMesaId);	
	}

}
