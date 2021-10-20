package com.udistrital.ws.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name = "sede")
public class Sede implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_sede;
	
    @NotEmpty
    private String nombre_sede;

	public long getId_sede() {
		return id_sede;
	}

	public void setId_sede(long id_sede) {
		this.id_sede = id_sede;
	}

	public String getNombre_sede() {
		return nombre_sede;
	}

	public void setNombre_sede(String nombre_sede) {
		this.nombre_sede = nombre_sede;
	}

	public Sede(long id_sede, @NotEmpty String nombre_sede) {
		super();
		this.id_sede = id_sede;
		this.nombre_sede = nombre_sede;
	}

	public Sede() {
		super();
	}
    
    

}
