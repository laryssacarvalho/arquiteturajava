package br.edu.infnet.appreservaviagem;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;

@Component
public class AviaoTeste implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Aviao a1 = new Aviao();
		a1.portao = "A123";
		a1.assento = "12";
		a1.voo = "AB12";
		System.out.println("Aviao - " + a1);
		
		Aviao a2 = new Aviao();
		a2.portao = "B123";
		a2.assento = "02";
		a2.voo = "BC12";
		System.out.println("Aviao - " + a2);
				
		Aviao a3 = new Aviao();
		a3.portao = "C123";
		a3.assento = "30";
		a3.voo = "CD12";		
		System.out.println("Aviao - " + a3);	
	}
}
