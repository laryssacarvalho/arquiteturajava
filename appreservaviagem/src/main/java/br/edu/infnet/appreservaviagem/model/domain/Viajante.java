package br.edu.infnet.appreservaviagem.model.domain;

import java.util.Date;

public class Viajante {
	private Integer id;
	private String nome;
	private String documento;
	private Date dataNascimento;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + ";" + documento + ";" + dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
}
