package com.udistrital.ws.entity.models;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "reserva")
public class Reserva implements Serializable {

	/**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo_reserva;
    
    @NotEmpty
    private String fecha_reserva;
    @NotNull
    private long numero_personas;
    @NotEmpty
    private String es_fumador;
    @NotEmpty
    private String tiene_plan;
    @NotNull
    private long cedula;
    @NotNull
    private long id_plan;
    @NotNull
    private long id_sede;
    
	public Reserva() {
		super();
	}
	public Reserva(@NotEmpty String fecha_reserva, @NotNull long numero_personas, @NotEmpty String es_fumador,
			@NotEmpty String tiene_plan, @NotNull long cedula, @NotNull long id_plan, @NotNull long id_sede) {
		super();
		this.fecha_reserva = fecha_reserva;
		this.numero_personas = numero_personas;
		this.es_fumador = es_fumador;
		this.tiene_plan = tiene_plan;
		this.cedula = cedula;
		this.id_plan = id_plan;
		this.id_sede = id_sede;
	}
	public long getCodigo_reserva() {
		return codigo_reserva;
	}
	public void setCodigo_reserva(long codigo_reserva) {
		this.codigo_reserva = codigo_reserva;
	}
	public String getFecha_reserva() {
		return fecha_reserva;
	}
	public void setFecha_reserva(String fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}
	public long getNumero_personas() {
		return numero_personas;
	}
	public void setNumero_personas(long numero_personas) {
		this.numero_personas = numero_personas;
	}
	public String getEs_fumador() {
		return es_fumador;
	}
	public void setEs_fumador(String es_fumador) {
		this.es_fumador = es_fumador;
	}
	public String getTiene_plan() {
		return tiene_plan;
	}
	public void setTiene_plan(String tiene_plan) {
		this.tiene_plan = tiene_plan;
	}
	public long getCedula() {
		return cedula;
	}
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	public long getId_plan() {
		return id_plan;
	}
	public void setId_plan(long id_plan) {
		this.id_plan = id_plan;
	}
	public long getId_sede() {
		return id_sede;
	}
	public void setId_sede(long id_sede) {
		this.id_sede = id_sede;
	}
}
