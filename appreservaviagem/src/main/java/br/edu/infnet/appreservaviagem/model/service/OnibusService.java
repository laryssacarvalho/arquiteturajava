package br.edu.infnet.appreservaviagem.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreservaviagem.model.domain.Onibus;
import br.edu.infnet.appreservaviagem.model.repository.OnibusRepository;

@Service
public class OnibusService {
	@Autowired
	private OnibusRepository onibusRepository;	
	
	public void incluir(Onibus o) {
		onibusRepository.save(o);		
	}
	
	public void excluir(Integer id) {
		onibusRepository.deleteById(id);
	}
	
	public Collection<Onibus> obterLista() {
		return (Collection<Onibus>) onibusRepository.findAll();
	}
	
	public Onibus obterPorId(Integer id) {
		return onibusRepository.findById(id).get();
	}
}
