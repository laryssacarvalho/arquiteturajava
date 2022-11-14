package br.edu.infnet.appreservaviagem.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appreservaviagem.model.domain.Viajante;

@Repository
public interface ViajanteRepository extends CrudRepository<Viajante, Integer>{
	@Query("from Viajante v where v.usuario.id =:userid")
	public List<Viajante> obterLista(Integer userid);
}
