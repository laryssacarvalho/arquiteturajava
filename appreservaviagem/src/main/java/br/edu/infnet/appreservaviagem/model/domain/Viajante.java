package br.edu.infnet.appreservaviagem.model.domain;

import java.util.Date;

public class Viajante {
	public String nome;
	public String documento;
	public Date dataNascimento;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + " Documento: " + documento + " Data Nascimento: " + dataNascimento;
	}
}
