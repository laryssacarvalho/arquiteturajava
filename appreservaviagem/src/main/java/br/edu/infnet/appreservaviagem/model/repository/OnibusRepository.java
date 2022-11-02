package br.edu.infnet.appreservaviagem.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appreservaviagem.model.domain.Onibus;

@Repository
public interface OnibusRepository extends CrudRepository<Onibus, Integer>{

}
