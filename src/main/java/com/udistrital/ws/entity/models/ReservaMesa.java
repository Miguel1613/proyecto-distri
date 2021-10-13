package com.udistrital.ws.entity.models;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "reserva_mesa")
@IdClass(ReservaMesaId.class)
public class ReservaMesa implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    private String id_mesa;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigo_reserva;
	
	@NotEmpty
    private String fecha_inicio;
    
    @NotEmpty
    private String fecha_fin;

	public String getId_mesa() {
		return id_mesa;
	}

	public void setId_mesa(String id_mesa) {
		this.id_mesa = id_mesa;
	}

	public String getCodigo_reserva() {
		return codigo_reserva;
	}

	public void setCodigo_reserva(String codigo_reserva) {
		this.codigo_reserva = codigo_reserva;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public ReservaMesa(String id_mesa, String codigo_reserva, @NotEmpty String fecha_inicio, @NotEmpty String fecha_fin) {
		super();
		this.id_mesa = id_mesa;
		this.codigo_reserva = codigo_reserva;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
	}

	public ReservaMesa() {
		super();
	}

	
    
    

}
