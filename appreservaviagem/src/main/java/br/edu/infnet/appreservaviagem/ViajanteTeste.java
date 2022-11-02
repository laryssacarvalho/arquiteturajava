package br.edu.infnet.appreservaviagem;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.controller.ViajanteController;
import br.edu.infnet.appreservaviagem.model.domain.Viajante;
import br.edu.infnet.appreservaviagem.model.service.ViajanteService;

@Order(2)
@Component
public class ViajanteTeste implements ApplicationRunner {
	@Autowired
	private ViajanteService viajanteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Viajantes ##");
		
		Viajante v1 = new Viajante();
		v1.setNome("Maria Silva");
		v1.setDocumento("111.222.333-44");
		v1.setDataNascimento(new Date());
		System.out.println("> " + v1);
		viajanteService.incluir(v1);
		
		Viajante v2 = new Viajante();
		v2.setNome("João Souza");
		v2.setDocumento("222.333.444-55");
		v2.setDataNascimento(new Date());
		System.out.println("> " + v2);
		viajanteService.incluir(v2);
		
		Viajante v3 = new Viajante();
		v3.setNome("Pedro Camargo");
		v3.setDocumento("333.444.555-66");
		v3.setDataNascimento(new Date());
		System.out.println("> " + v3);		
		viajanteService.incluir(v3);
	}

}
