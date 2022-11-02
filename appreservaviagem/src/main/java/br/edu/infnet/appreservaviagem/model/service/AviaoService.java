package br.edu.infnet.appreservaviagem.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;
import br.edu.infnet.appreservaviagem.model.repository.AviaoRepository;

@Service
public class AviaoService {
	@Autowired
	private AviaoRepository aviaoRepository;		
	
	public void incluir(Aviao aviao) {
		aviaoRepository.save(aviao);	
	}
	
	public void excluir(Integer id) {
		aviaoRepository.deleteById(id);
	}
	
	public Collection<Aviao> obterLista() {
		return (Collection<Aviao>) aviaoRepository.findAll();
	}
	
	public Aviao obterPorId(Integer id) {
		return aviaoRepository.findById(id).get();
		//return mapa.get(id);
	}
}
