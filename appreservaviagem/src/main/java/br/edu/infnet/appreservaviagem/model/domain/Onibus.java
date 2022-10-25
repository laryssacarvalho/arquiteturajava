package br.edu.infnet.appreservaviagem.model.domain;

public class Onibus extends Passagem {
	public String poltrona;	
	public String linha;
	public String plataforma;
	
	@Override
	public String toString() {
		return "Linha: "+ linha + " Plataforma: " + plataforma + " Poltrona: " + poltrona;
	}
}
