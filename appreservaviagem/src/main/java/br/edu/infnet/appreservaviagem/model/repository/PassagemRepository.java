package br.edu.infnet.appreservaviagem.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appreservaviagem.model.domain.Passagem;

@Repository
public interface PassagemRepository extends CrudRepository<Passagem, Integer>{
	@Query("from Passagem p where p.usuario.id =:userid")
	public List<Passagem> obterLista(Integer userid);
}
