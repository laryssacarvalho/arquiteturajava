package br.edu.infnet.appreservaviagem.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreservaviagem.model.domain.Passagem;
import br.edu.infnet.appreservaviagem.model.repository.PassagemRepository;

@Service
public class PassagemService {
	@Autowired
	private PassagemRepository passagemRepository;
	
	public void incluir(Passagem passagem) {
		passagemRepository.save(passagem);
	}
	
	public void excluir(Integer id) {
		passagemRepository.deleteById(id);	
	}
	
	public Collection<Passagem> obterLista() {
		return (Collection<Passagem>) passagemRepository.findAll();
	}
	
	public Passagem obterPorId(Integer id) {
		return passagemRepository.findById(id).get();
	}
}
