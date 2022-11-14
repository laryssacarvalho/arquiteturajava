package br.edu.infnet.appreservaviagem.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "treserva")
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private double total;
	private String codigo;	
	private LocalDateTime dataCompra;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idViajante")
	private Viajante viajante;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Passagem> passagens;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Reserva() {
		dataCompra = LocalDateTime.now();
	}
	
	public Reserva(Viajante viajante) {
		this();
		this.viajante = viajante;
	}
	
	@Override
	public String toString() {
		return codigo + ";" + dataCompra + ";" + total + ";" + viajante + ";" + passagens.size();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getData() {
		return dataCompra;
	}

	public void setData(LocalDateTime data) {
		this.dataCompra = data;
	}

	public Viajante getViajante() {
		return viajante;
	}

	public void setViajante(Viajante viajante) {
		this.viajante = viajante;
	}

	public List<Passagem> getPassagens() {
		return passagens;
	}

	public void setPassagens(List<Passagem> passagens) {
		this.passagens = passagens;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}	
}
