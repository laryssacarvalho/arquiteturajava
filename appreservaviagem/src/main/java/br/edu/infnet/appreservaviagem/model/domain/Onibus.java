package br.edu.infnet.appreservaviagem.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tonibus")
public class Onibus extends Passagem {
	private String poltrona;	
	private String linha;
	private String plataforma;
	
	@Override
	public String toString() {
		return super.toString() + ";"+ linha + ";" + plataforma + ";" + poltrona;
	}

	public String getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(String poltrona) {
		this.poltrona = poltrona;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}	
}
