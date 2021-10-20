package com.udistrital.ws.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name = "zona")
public class Zona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_zona;
	
    @NotEmpty
    private String nombre_zona;
    
    @NotEmpty
    private String descripcion_zona;

	public long getId_zona() {
		return id_zona;
	}

	public void setId_zona(long id_zona) {
		this.id_zona = id_zona;
	}

	public String getNombre_zona() {
		return nombre_zona;
	}

	public void setNombre_zona(String nombre_zona) {
		this.nombre_zona = nombre_zona;
	}

	public String getDescripcion_zona() {
		return descripcion_zona;
	}

	public void setDescripcion_zona(String descripcion_zona) {
		this.descripcion_zona = descripcion_zona;
	}

	public Zona(long id_zona, @NotEmpty String nombre_zona, @NotEmpty String descripcion_zona) {
		super();
		this.id_zona = id_zona;
		this.nombre_zona = nombre_zona;
		this.descripcion_zona = descripcion_zona;
	}

	public Zona() {
		super();
	}
    
    
}
