package br.edu.infnet.appreservaviagem.model.domain;

import java.util.Date;

public class Reserva {
	private double total;
	private String codigo;
	private Date data;
	
	@Override
	public String toString() {
		return codigo + ";" + data + ";" + total;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}	
}
