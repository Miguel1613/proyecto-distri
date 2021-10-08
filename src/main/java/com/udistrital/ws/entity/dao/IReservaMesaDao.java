package com.udistrital.ws.entity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udistrital.ws.entity.models.ReservaMesa;
import com.udistrital.ws.entity.models.ReservaMesaId;
@Repository
public interface IReservaMesaDao extends CrudRepository<ReservaMesa, ReservaMesaId>{

}
