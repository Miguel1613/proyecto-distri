select distinct b.nombre_zona from mesa a, zona b where a.capacidad >= 7 and a.id_zona = b.id_zona and a.id_mesa not in(select distinct em.id_mesa from estado_mesa em, mesa m where   ('2021-10-06 14:30:00' BETWEEN em.fecha_inicio and em.fecha_fin) or ('2021-10-06 15:30:00' BETWEEN em.fecha_inicio and em.fecha_fin) and m.capacidad >= 7 and em.id_mesa = m.id_mesa);



select id_mesa from mesa where capacidad >= 7 and id_mesa not in (select em.id_mesa from estado_mesa em, mesa m where ((em.fecha_inicio <= '2021-10-06 14:30:00' and em.fecha_fin <= '2021-10-06 15:30:00')or(em.fecha_inicio >= '2021-10-06 14:30:00' and em.fecha_fin >= '2021-10-06 15:30:00')) and m.capacidad >= 7 and em.id_mesa = m.id_mesa) order by capacidad asc limit 1;




select em.id_mesa from estado_mesa em, mesa m where ((em.fecha_inicio <= '2021-10-06 14:30:00' and em.fecha_fin <= '2021-10-06 15:30:00')or(em.fecha_inicio >= '2021-10-06 14:30:00' and em.fecha_fin >= '2021-10-06 15:30:00')) and m.capacidad >= 7 and em.id_mesa = m.id_mesa ;
select * from estado_mesa em ;
SELECT * FROM mesa;



select distinct em.id_mesa from estado_mesa em, mesa m where   ('2021-10-07 14:30:00' BETWEEN em.fecha_inicio and em.fecha_fin) or ('2021-10-07 15:30:00' BETWEEN em.fecha_inicio and em.fecha_fin) ;

insert into estado_mesa (id_estado ,id_mesa,fecha_inicio,fecha_fin) values (1,6,"2021-10-06 14:00:00","2021-10-06 15:00:00");