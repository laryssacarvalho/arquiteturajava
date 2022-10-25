package br.edu.infnet.appreservaviagem.model.domain;

public class Carona extends Passagem {
	public String marca;
	public String modelo;
	public String placa;
	@Override
	public String toString() {
		return "Marca: "+ marca + " Modelo: " + modelo + " Placa: " + placa;
	}
}
