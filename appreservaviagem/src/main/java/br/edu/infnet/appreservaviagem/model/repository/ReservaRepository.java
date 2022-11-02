package br.edu.infnet.appreservaviagem.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appreservaviagem.model.domain.Reserva;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer>{

}
