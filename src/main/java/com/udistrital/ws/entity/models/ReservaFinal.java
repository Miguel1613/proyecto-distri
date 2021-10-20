package com.udistrital.ws.entity.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ReservaFinal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Timestamp fecha_inicio;

    private Timestamp fecha_fin;
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
	@NotEmpty
    private String nombre;
    @NotEmpty
    private String celular;
    @NotEmpty
    private String email;
    private long id_mesa;
    public ReservaFinal() {
		super();
	}
	public ReservaFinal( Timestamp fecha_inicio,  Timestamp fecha_fin, @NotNull long numero_personas,
			@NotEmpty String es_fumador, @NotEmpty String tiene_plan, @NotNull long cedula, @NotNull long id_plan,
			@NotNull long id_sede, @NotEmpty String nombre, @NotEmpty String celular, @NotEmpty String email,
			long id_mesa, @NotNull long id_estado) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.numero_personas = numero_personas;
		this.es_fumador = es_fumador;
		this.tiene_plan = tiene_plan;
		this.cedula = cedula;
		this.id_plan = id_plan;
		this.id_sede = id_sede;
		this.nombre = nombre;
		this.celular = celular;
		this.email = email;
		this.id_mesa = id_mesa;
		this.id_estado = id_estado;
	}
	public Timestamp getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Timestamp fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Timestamp getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Timestamp fecha_fin) {
		this.fecha_fin = fecha_fin;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId_mesa() {
		return id_mesa;
	}
	public void setId_mesa(long id_mesa) {
		this.id_mesa = id_mesa;
	}
	public long getId_estado() {
		return id_estado;
	}
	public void setId_estado(long id_estado) {
		this.id_estado = id_estado;
	}
	@NotNull
    private long id_estado;
}
