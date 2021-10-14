package com.udistrital.ws.entity.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.udistrital.ws.entity.models.Cliente;


public interface IClienteDao extends CrudRepository<Cliente, Long>{
	@Modifying
	@Transactional
	@Query (value="update cliente set  celular = ?2 where cedula = ?1", nativeQuery=true)
	 void updateCelular(long cedula, String celular);
	@Modifying
	@Transactional
	@Query (value="update cliente set  nombre = ?2 where cedula = ?1", nativeQuery=true)
	 void updateNombre(long cedula, String nombre);
	@Modifying
	@Transactional
	@Query (value="update cliente set  email = ?2 where cedula = ?1", nativeQuery=true)
	 void updateEmail(long cedula, String email);
}
