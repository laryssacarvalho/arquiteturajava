package br.edu.infnet.appreservaviagem;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Passagem;

@Component
public class PassagemTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Passagem p1 = new Passagem();
		p1.origem = "Salvador";
		p1.destino = "Rio de Janeiro";
		p1.data = new Date();
		System.out.println("Passagem - " + p1);
		
		Passagem p2 = new Passagem();
		p2.origem = "Curitiba";
		p2.destino = "Sao Paulo";
		p2.data = new Date();
		System.out.println("Passagem - " + p2);
				
		Passagem p3 = new Passagem();
		p3.origem = "Sao Paulo";
		p3.destino = "Navegantes";
		p3.data = new Date();
		System.out.println("Passagem - " + p3);		
	}
	
}
