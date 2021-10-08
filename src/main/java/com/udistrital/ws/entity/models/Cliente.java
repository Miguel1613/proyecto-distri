package com.udistrital.ws.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private long cedula;
	
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String celular;
    
    @NotEmpty
    private String email;

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Cliente(long cedula, @NotEmpty String nombre, @NotEmpty String celular, @NotEmpty String email) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.celular = celular;
		this.email = email;
	}

	public Cliente() {
		super();
	}
    
    
    
    

}
