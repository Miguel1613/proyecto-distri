package com.udistrital.ws.entity.services;

import java.util.List;

import com.udistrital.ws.entity.models.Sede;


public interface ISedeService {
	public Sede get(long id_sede);
	public List<Sede> getAll();
	public void post(Sede sede);
	public void delete(long id_sede);
}
