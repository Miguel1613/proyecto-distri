package com.udistrital.ws.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.udistrital.ws.entity.dao.IZonaDao;
import com.udistrital.ws.entity.models.Zona;
@Service
public class ZonaServiceImpl implements IZonaService {
	@Autowired
	private IZonaDao zonaDao;
	@Override
	public Zona get(long id_zona) {
		return zonaDao.findById(id_zona).get();
	}

	@Override
	public List<Zona> getAll() {
	return (List<Zona>) zonaDao.findAll();
	}

	@Override
	public void post(Zona zona) {
	 zonaDao.save(zona);
	}

	@Override
	public void delete(long id_zona) {
		zonaDao.deleteById(id_zona);
	}

}
