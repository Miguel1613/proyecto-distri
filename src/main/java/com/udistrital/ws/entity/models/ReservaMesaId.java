package com.udistrital.ws.entity.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;


public class ReservaMesaId implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "codigo_reserva")
    private Long codigo_reserva;

    @Column(name = "id_mesa")
    private Long id_mesa;

	public ReservaMesaId() {
		super();
	}

	public ReservaMesaId(Long codigo_reserva, Long id_mesa) {
		super();
		this.codigo_reserva = codigo_reserva;
		this.id_mesa = id_mesa;
	}

	public Long getCodigo_reserva() {
		return codigo_reserva;
	}

	public void setCodigo_reserva(Long codigo_reserva) {
		this.codigo_reserva = codigo_reserva;
	}

	public Long getId_mesa() {
		return id_mesa;
	}

	public void setId_mesa(Long id_mesa) {
		this.id_mesa = id_mesa;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservaMesaId that = (ReservaMesaId) o;
        return codigo_reserva.equals(that.codigo_reserva) &&
                id_mesa.equals(that.id_mesa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo_reserva, id_mesa);
    }
	
	
}
