package com.udistrital.ws.entity.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.ws.entity.dao.IEstadoMesaDao;
import com.udistrital.ws.entity.models.EstadoMesa;
import com.udistrital.ws.entity.models.EstadoMesaId;


@Service
public class EstadoMesaServiceImpl implements IEstadoMesaService {
	@Autowired
	private IEstadoMesaDao estadoMesaDao;

	@Override
	public EstadoMesa get(EstadoMesaId estadoMesaId) {
		return estadoMesaDao.findById(estadoMesaId).get();
	}

	@Override
	public List<EstadoMesa> getAll() {
		return (List<EstadoMesa>) estadoMesaDao.findAll();
	}

	@Override
	public void post(EstadoMesa estadoMesa) {
		estadoMesaDao.save(estadoMesa);
	}

	

	@Override
	public void delete(EstadoMesaId estadoMesaId) {
		estadoMesaDao.deleteById(estadoMesaId);
	}


	@Override
	public String getmesa(long cantidad, Timestamp fecha_inicio, Timestamp fecha_fin) {
		return estadoMesaDao.findmesa(cantidad,fecha_inicio,fecha_fin);
	}

	@Override
	public List<String> getzonas(long cantidad, String fecha_inicio, String fecha_fin) {
		return estadoMesaDao.findzonas(cantidad,fecha_inicio,fecha_fin);
	}
}
