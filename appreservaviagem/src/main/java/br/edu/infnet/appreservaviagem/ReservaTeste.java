package br.edu.infnet.appreservaviagem;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Reserva;

@Order(1)
@Component
public class ReservaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Reservas ##");
		
		Reserva r1 = new Reserva();
		r1.setCodigo("R001");
		r1.setTotal(100);
		r1.setData(new Date());
		System.out.println("> " + r1);
		
		Reserva r2 = new Reserva();
		r2.setCodigo("R002");
		r2.setTotal(500);
		r2.setData(new Date());
		System.out.println("> " + r2);
				
		Reserva r3 = new Reserva();
		r3.setCodigo("R003");
		r3.setTotal(50);
		r3.setData(new Date());
		System.out.println("> " + r3);			
	}

}
