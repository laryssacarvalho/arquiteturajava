package br.edu.infnet.appreservaviagem.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreservaviagem.model.domain.Carona;
import br.edu.infnet.appreservaviagem.model.repository.CaronaRepository;

@Service
public class CaronaService {
	@Autowired
	private CaronaRepository caronaRepository;
	
	public void incluir(Carona carona) {
		caronaRepository.save(carona);		
	}
	
	public void excluir(Integer id) {
		caronaRepository.deleteById(id);
	}
	
	public Collection<Carona> obterLista() {
		return (Collection<Carona>) caronaRepository.findAll();	
	}
	
	public Carona obterPorId(Integer id) {
		return caronaRepository.findById(id).get();
	}
}
