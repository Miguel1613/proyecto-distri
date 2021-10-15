package com.udistrital.ws.entity.services;

import com.udistrital.ws.entity.models.ReservaFinal;

public interface IReservaFinalService {
public String InsertReserva(ReservaFinal reserva);
public String DeleteReserva(long codigo_reserva);
}
