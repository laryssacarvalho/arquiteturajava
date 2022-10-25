package br.edu.infnet.appreservaviagem.model.domain;

import java.util.Date;

public class Reserva {
	public double total;
	public String codigo;
	public Date data;
	
	@Override
	public String toString() {
		return "Código: "+ codigo + " Data: " + data + " Total: " + total;
	}
}
