package com.udistrital.ws.entity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.udistrital.ws.entity.models.Reserva;

public interface IReservaDao extends CrudRepository<Reserva, Long> {
	@Query (value="select * from reserva where cedula= ?1", nativeQuery=true)
	 List<Reserva> findbycedula(long cedula);
}
