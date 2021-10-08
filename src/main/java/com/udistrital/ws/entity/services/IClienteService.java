package com.udistrital.ws.entity.services;

import java.util.List;

import com.udistrital.ws.entity.models.Cliente;


public interface IClienteService {
	public Cliente get(long cedula);
	public List<Cliente> getAll();
	public void post(Cliente cliente);
	public void put (Cliente cliente, long cedula);
	public void delete(long cedula);
}
