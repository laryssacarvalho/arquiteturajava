package br.edu.infnet.appreservaviagem.model.domain;

import java.util.Date;

public class Passagem {
	private String origem;
	private String destino;
	private Date data;
	
	@Override
	public String toString() {
		return origem + ";" + destino + ";" + data;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}	
}
