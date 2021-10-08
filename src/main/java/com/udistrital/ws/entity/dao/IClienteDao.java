package com.udistrital.ws.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.udistrital.ws.entity.models.Cliente;


public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
