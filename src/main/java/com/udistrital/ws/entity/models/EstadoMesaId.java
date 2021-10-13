package com.udistrital.ws.entity.models;

import java.io.Serializable;


public class EstadoMesaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id_mesa;
	private String fecha_inicio;
	public String getId_mesa() {
		return id_mesa;
	}
	public void setId_mesa(String id_mesa) {
		this.id_mesa = id_mesa;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public EstadoMesaId(String id_mesa, String fecha_inicio) {
		super();
		this.id_mesa = id_mesa;
		this.fecha_inicio = fecha_inicio;
	}
	public EstadoMesaId() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha_inicio == null) ? 0 : fecha_inicio.hashCode());
		result = prime * result + ((id_mesa == null) ? 0 : id_mesa.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstadoMesaId other = (EstadoMesaId) obj;
		if (fecha_inicio == null) {
			if (other.fecha_inicio != null)
				return false;
		} else if (!fecha_inicio.equals(other.fecha_inicio))
			return false;
		if (id_mesa == null) {
			if (other.id_mesa != null)
				return false;
		} else if (!id_mesa.equals(other.id_mesa))
			return false;
		return true;
	}


	
    
	




}
