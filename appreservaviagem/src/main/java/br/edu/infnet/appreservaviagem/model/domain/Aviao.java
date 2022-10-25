package br.edu.infnet.appreservaviagem.model.domain;

public class Aviao extends Passagem {	
	public String portao;
	public String assento;
	public String voo;
	@Override
	public String toString() {
		return "Voo: "+ voo + " Portao: " + portao + " Assento: " + assento;
	}
}
