package br.edu.infnet.appreservaviagem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;
import br.edu.infnet.appreservaviagem.model.domain.Passagem;
import br.edu.infnet.appreservaviagem.model.domain.Reserva;
import br.edu.infnet.appreservaviagem.model.domain.Usuario;
import br.edu.infnet.appreservaviagem.model.domain.Viajante;
import br.edu.infnet.appreservaviagem.model.service.ReservaService;

@Order(7)
@Component
public class ReservaTeste implements ApplicationRunner {
	@Autowired
	private ReservaService reservaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Reservas ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Viajante v1 = new Viajante();
		v1.setDataNascimento(new Date());
		v1.setDocumento("111.222.333-44");
		v1.setNome("Maria Silva");
		v1.setId(1);
		
		Aviao a1 = new Aviao();
		a1.setOrigem("Salvador");
		a1.setDestino("Rio de Janeiro");
		a1.setData(new Date());
		a1.setAssento("10");
		a1.setPortao("AB12");
		a1.setVoo("4567");
		a1.setId(1);
		
		List<Passagem> passagensPrimeiraReserva = new ArrayList<Passagem>();
		passagensPrimeiraReserva.add(a1);		
		
		List<Passagem> passagensDemaisReservas = new ArrayList<Passagem>();
		passagensDemaisReservas.add(a1);		
		
		Reserva r1 = new Reserva();
		r1.setCodigo("R001");
		r1.setTotal(100);		
		r1.setViajante(v1);
		r1.setPassagens(passagensPrimeiraReserva);
		r1.setUsuario(usuario);
		System.out.println("> " + r1);
		reservaService.incluir(r1);
		
		Reserva r2 = new Reserva(v1);
		r2.setCodigo("R002");
		r2.setTotal(500);
		r2.setPassagens(passagensDemaisReservas);
		r2.setUsuario(usuario);
		System.out.println("> " + r2);
		reservaService.incluir(r2);
		
		Reserva r3 = new Reserva();
		r3.setCodigo("R003");
		r3.setTotal(50);
		r3.setViajante(v1);
		r3.setPassagens(passagensDemaisReservas);
		r3.setUsuario(usuario);
		System.out.println("> " + r3);			
		reservaService.incluir(r3);
	}

}
