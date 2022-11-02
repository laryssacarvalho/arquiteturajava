package br.edu.infnet.appreservaviagem.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreservaviagem.model.domain.Reserva;
import br.edu.infnet.appreservaviagem.model.repository.ReservaRepository;

@Service
public class ReservaService {
	@Autowired
	private ReservaRepository reservaRepository;
	
	public void incluir(Reserva reserva) {
		reservaRepository.save(reserva);
	}
	
	public void excluir(Integer id) {
		reservaRepository.deleteById(id);
	}
	
	public Collection<Reserva> obterLista() {
		return (Collection<Reserva>) reservaRepository.findAll();	
	}
	
	public Reserva obterPorId(Integer id) {
		return reservaRepository.findById(id).get();
	}
}
