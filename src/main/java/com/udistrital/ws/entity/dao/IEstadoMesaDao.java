package com.udistrital.ws.entity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udistrital.ws.entity.models.EstadoMesa;
import com.udistrital.ws.entity.models.EstadoMesaId;


@Repository
public interface IEstadoMesaDao extends CrudRepository<EstadoMesa, EstadoMesaId> {
	@Query (value="select id_mesa from mesa where capacidad >= ?1 and id_mesa not in (select distinct em.id_mesa from estado_mesa em, mesa m where   (?2 BETWEEN em.fecha_inicio and em.fecha_fin) or (?3 BETWEEN em.fecha_inicio and em.fecha_fin) and m.capacidad >= ?1 and em.id_mesa = m.id_mesa) order by capacidad asc limit 1", nativeQuery=true)
	 String findmesa(long cantidad, String fecha_inicio, String fecha_fin);
	
	@Query (value="select distinct b.nombre_zona from mesa a, zona b where a.capacidad >= ?1 and a.id_zona = b.id_zona and a.id_mesa not in(select distinct em.id_mesa from estado_mesa em, mesa m where   (?2 BETWEEN em.fecha_inicio and em.fecha_fin) or (?3 BETWEEN em.fecha_inicio and em.fecha_fin) and m.capacidad >= ?1 and em.id_mesa = m.id_mesa)", nativeQuery=true)
	 List<String> findzonas(long cantidad, String fecha_inicio, String fecha_fin);
}
