package br.edu.infnet.appreservaviagem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.controller.ReservaController;
import br.edu.infnet.appreservaviagem.model.domain.Aviao;
import br.edu.infnet.appreservaviagem.model.domain.Carona;
import br.edu.infnet.appreservaviagem.model.domain.Onibus;
import br.edu.infnet.appreservaviagem.model.domain.Passagem;
import br.edu.infnet.appreservaviagem.model.domain.Reserva;
import br.edu.infnet.appreservaviagem.model.domain.Viajante;

@Order(1)
@Component
public class ReservaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Reservas ##");
		
		Viajante v1 = new Viajante();
		v1.setDataNascimento(new Date());
		v1.setDocumento("111.222.333-44");
		v1.setNome("Maria Silva");
		
		Aviao a1 = new Aviao();
		a1.setOrigem("Salvador");
		a1.setDestino("Rio de Janeiro");
		a1.setData(new Date());
		a1.setAssento("10");
		a1.setPortao("AB12");
		a1.setVoo("4567");
		
		Onibus o1 = new Onibus();
		o1.setOrigem("Curitiba");
		o1.setDestino("Sao Paulo");
		o1.setData(new Date());
		o1.setLinha("CURITIBA - SAO PAULO");
		o1.setPlataforma("20");
		o1.setPoltrona("02");
				
		Carona c1 = new Carona();
		c1.setOrigem("Tatui");
		c1.setDestino("Sorocaba");
		c1.setData(new Date());
		c1.setMarca("Ford");
		c1.setModelo("Ka");
		c1.setPlaca("AAA1B12");	
		
		List<Passagem> passagensPrimeiraReserva = new ArrayList<Passagem>();
		passagensPrimeiraReserva.add(a1);
		passagensPrimeiraReserva.add(c1);
		
		List<Passagem> passagensDemaisReservas = new ArrayList<Passagem>();
		passagensDemaisReservas.add(a1);
		passagensDemaisReservas.add(c1);
		passagensDemaisReservas.add(o1);
		
		Reserva r1 = new Reserva();
		r1.setCodigo("R001");
		r1.setTotal(100);		
		r1.setViajante(v1);
		r1.setPassagens(passagensPrimeiraReserva);
		System.out.println("> " + r1);
		ReservaController.incluir(r1);
		
		Reserva r2 = new Reserva(v1);
		r2.setCodigo("R002");
		r2.setTotal(500);
		r2.setPassagens(passagensDemaisReservas);
		System.out.println("> " + r2);
		ReservaController.incluir(r2);
		
		Reserva r3 = new Reserva();
		r3.setCodigo("R003");
		r3.setTotal(50);
		r3.setViajante(v1);
		r3.setPassagens(passagensDemaisReservas);
		System.out.println("> " + r3);			
		ReservaController.incluir(r3);
	}

}
