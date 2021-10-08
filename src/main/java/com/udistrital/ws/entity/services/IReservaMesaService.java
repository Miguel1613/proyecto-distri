package com.udistrital.ws.entity.services;

import java.util.List;


import com.udistrital.ws.entity.models.ReservaMesa;
import com.udistrital.ws.entity.models.ReservaMesaId;

public interface IReservaMesaService {
	public ReservaMesa get(ReservaMesaId reservaMesaId);
	public List<ReservaMesa> getAll();
	public void post(ReservaMesa reservaMesa);

	public void delete(ReservaMesaId reservaMesaId);
}
