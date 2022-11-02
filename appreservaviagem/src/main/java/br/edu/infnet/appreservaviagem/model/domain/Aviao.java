package br.edu.infnet.appreservaviagem.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "taviao")
public class Aviao extends Passagem {	
	private String portao;
	private String assento;
	private String voo;
	
	@Override
	public String toString() {
		return super.toString() + ";" + voo + ";" + portao + ";" + assento;
	}
	public String getPortao() {
		return portao;
	}
	public void setPortao(String portao) {
		this.portao = portao;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}
	public String getVoo() {
		return voo;
	}
	public void setVoo(String voo) {
		this.voo = voo;
	}
	
}
