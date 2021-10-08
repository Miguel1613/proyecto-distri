package com.udistrital.ws.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.ws.entity.dao.IClienteDao;
import com.udistrital.ws.entity.models.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {
	@Autowired
	private IClienteDao clienteDao;
	@Override
	public Cliente get(long cedula) {
		return clienteDao.findById(cedula).get();
	}

	@Override
	public List<Cliente> getAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public void post(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	public void put(Cliente cliente, long cedula) {
		clienteDao.findById(cedula).ifPresent((x)->{
			cliente.setCedula(cedula);
			clienteDao.save(cliente);
		});
	}

	@Override
	public void delete(long cedula) {
		clienteDao.deleteById(cedula);
	}

}
