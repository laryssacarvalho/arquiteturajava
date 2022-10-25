package br.edu.infnet.appreservaviagem;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Viajante;

@Component
public class ViajanteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Viajante v1 = new Viajante();
		v1.nome = "Maria Silva";
		v1.documento = "111.222.333-44";
		v1.dataNascimento = new Date();
		System.out.println("Viajante - " + v1);
		
		Viajante v2 = new Viajante();
		v2.nome = "João Souza";
		v2.documento = "222.333.444-55";
		v2.dataNascimento = new Date();
		System.out.println("Viajante - " + v2);
				
		Viajante v3 = new Viajante();
		v3.nome = "Pedro Camargo";
		v3.documento = "333.444.555-66";
		v3.dataNascimento = new Date();
		System.out.println("Viajante - " + v3);	
		
	}

}
