package br.edu.infnet.appreservaviagem.model.domain;

import java.util.Date;

public class Passagem {
	public String origem;
	public String destino;
	public Date data;
	
	@Override
	public String toString() {
		return "Origem: "+ origem + " Destino: " + destino + " Data: " + data;
	}
}
