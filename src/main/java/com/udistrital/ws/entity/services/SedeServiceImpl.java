package com.udistrital.ws.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.ws.entity.dao.ISedeDao;
import com.udistrital.ws.entity.models.Sede;

@Service
public class SedeServiceImpl implements ISedeService {
	@Autowired
	private ISedeDao sedeDao;
	@Override
	public Sede get(long id_sede) {
		return sedeDao.findById(id_sede).get();
	}

	@Override
	public List<Sede> getAll() {
     return (List<Sede>) sedeDao.findAll();
	}

	@Override
	public void post(Sede sede) {
    sedeDao.save(sede);
	}

	@Override
	public void delete(long id_sede) {
     sedeDao.deleteById(id_sede);
	}

}
