package com.udistrital.ws.entity.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "estado_mesa")
@IdClass(EstadoMesaId.class)
public class EstadoMesa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    private String id_mesa;
    @Id
    private Timestamp fecha_inicio;
	
	@NotNull
	private long id_estado;
	
    private Timestamp fecha_fin;
	public String getId_mesa() {
		return id_mesa;
	}
	public void setId_mesa(String id_mesa) {
		this.id_mesa = id_mesa;
	}
	public Timestamp getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Timestamp timestamp) {
		this.fecha_inicio = timestamp;
	}
	public long getId_estado() {
		return id_estado;
	}
	public void setId_estado(long id_estado) {
		this.id_estado = id_estado;
	}
	public  Timestamp getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Timestamp timestamp) {
		this.fecha_fin = timestamp;
	}
	public EstadoMesa(String id_mesa, Timestamp fecha_inicio, @NotNull long id_estado, Timestamp fecha_fin) {
		super();
		this.id_mesa = id_mesa;
		this.fecha_inicio = fecha_inicio;
		this.id_estado = id_estado;
		this.fecha_fin = fecha_fin;
	}
	public EstadoMesa() {
		super();
	}
	
	
}
