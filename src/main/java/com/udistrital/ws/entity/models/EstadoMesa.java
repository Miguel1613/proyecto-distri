package com.udistrital.ws.entity.models;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
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
    private long id_mesa;
    @Id
    private String fecha_inicio;
	
	@NotNull
	private long id_estado;
	@NotEmpty
    private String fecha_fin;
	public long getId_mesa() {
		return id_mesa;
	}
	public void setId_mesa(long id_mesa) {
		this.id_mesa = id_mesa;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public long getId_estado() {
		return id_estado;
	}
	public void setId_estado(long id_estado) {
		this.id_estado = id_estado;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public EstadoMesa(long id_mesa, String fecha_inicio, @NotNull long id_estado, @NotEmpty String fecha_fin) {
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
