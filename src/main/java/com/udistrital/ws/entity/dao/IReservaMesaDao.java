package com.udistrital.ws.entity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.udistrital.ws.entity.models.Reserva;
import com.udistrital.ws.entity.models.ReservaMesa;
import com.udistrital.ws.entity.models.ReservaMesaId;
@Repository
public interface IReservaMesaDao extends CrudRepository<ReservaMesa, ReservaMesaId>{
	@Query (value="select id_mesa from reserva_mesa where codigo_reserva = ?1", nativeQuery=true)
	 String findidmesa(long codigo_reserva);
	
	@Modifying
	@Transactional
	@Query (value="delete from reserva_mesa where codigo_reserva = ?1", nativeQuery=true)
	 void deleteReservaMesa(long codigo_reserva);
}
