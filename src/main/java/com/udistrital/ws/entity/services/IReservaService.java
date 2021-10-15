package com.udistrital.ws.entity.services;

import java.util.List;

import com.udistrital.ws.entity.models.Reserva;

public interface IReservaService {
	public Reserva get(long codigo_reserva);
	public List<Reserva> getAll();
	public void post(Reserva reserva);
	public void put (Reserva reserva, long id);
	public void delete(long codigo_reserva);
	public List<Reserva> getbycedula(long cedula);
}
