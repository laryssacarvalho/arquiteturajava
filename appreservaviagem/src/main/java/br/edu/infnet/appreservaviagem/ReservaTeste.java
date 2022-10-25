package br.edu.infnet.appreservaviagem;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Reserva;

@Component
public class ReservaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Reserva r1 = new Reserva();
		r1.codigo = "R001";
		r1.total = 100;
		r1.data = new Date();
		System.out.println("Reserva - " + r1);
		
		Reserva r2 = new Reserva();
		r2.codigo = "R002";
		r2.total = 500;
		r2.data = new Date();
		System.out.println("Reserva - " + r2);
				
		Reserva r3 = new Reserva();
		r3.codigo = "R003";
		r3.total = 50;
		r3.data = new Date();
		System.out.println("Reserva - " + r3);	
		
	}

}
