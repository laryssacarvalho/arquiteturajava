package br.edu.infnet.appreservaviagem.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tcarona")
public class Carona extends Passagem {
	private String marca;
	private String modelo;
	private String placa;
	
	@Override
	public String toString() {
		return super.toString() + ";" + marca + ";" + modelo + ";" + placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}	
}
