package com.udistrital.ws.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.udistrital.ws.entity.models.Reserva;

public interface IReservaDao extends CrudRepository<Reserva, Long> {

}
