package br.edu.infnet.appreservaviagem.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreservaviagem.model.domain.Usuario;
import br.edu.infnet.appreservaviagem.model.domain.Viajante;
import br.edu.infnet.appreservaviagem.model.repository.ViajanteRepository;


@Service
public class ViajanteService {
	@Autowired
	private ViajanteRepository viajanteRepository;
	
	public void incluir(Viajante viajante) {
		viajanteRepository.save(viajante);	
	}
	
	public void excluir(Integer id) {
		viajanteRepository.deleteById(id);
	}
	
	public Collection<Viajante> obterLista() {
		return (Collection<Viajante>) viajanteRepository.findAll();
	}
	
	public Collection<Viajante> obterLista(Integer userid) {
		return (Collection<Viajante>) viajanteRepository.obterLista(userid);
	}
	
	public Collection<Viajante> obterLista(Usuario usuario){
		return (Collection<Viajante>) viajanteRepository.obterLista(usuario.getId());
	}
}
