package com.udistrital.ws.entity.services;

import java.util.List;

import com.udistrital.ws.entity.models.EstadoMesa;
import com.udistrital.ws.entity.models.EstadoMesaId;



public interface IEstadoMesaService {
	public EstadoMesa get(EstadoMesaId estadoMesaId);
	public List<EstadoMesa> getAll();
	public void post(EstadoMesa estadoMesa);
	public String getmesa(long cantidad, String fecha_inicio, String fecha_fin);
	public List<String> getzonas(long cantidad, String fecha_inicio, String fecha_fin);
	public void delete(EstadoMesaId estadoMesaId);
}
