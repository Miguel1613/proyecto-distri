package com.udistrital.ws.entity.services;

import java.util.List;


import com.udistrital.ws.entity.models.Zona;

public interface IZonaService {
	public Zona get(long id_zona);
	public List<Zona> getAll();
	public void post(Zona zona);
	public void delete(long id_zona);
}
