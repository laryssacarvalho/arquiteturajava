package br.edu.infnet.appreservaviagem;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;

@Component
public class AviaoTeste implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Passagens de Aviao ##");
		
		Aviao a1 = new Aviao();
		a1.setOrigem("Salvador");
		a1.setDestino("Rio de Janeiro");
		a1.setData(new Date());
		a1.setAssento("12");
		a1.setPortao("A123");
		a1.setVoo("AB12");
		System.out.println("> " + a1);		
		
		Aviao a2 = new Aviao();
		a2.setOrigem("Sao Paulo");
		a2.setDestino("Navegantes");
		a2.setData(new Date());
		a2.setAssento("02");
		a2.setPortao("B123");
		a2.setVoo("BC12");
		System.out.println("> " + a2);
				
		Aviao a3 = new Aviao();
		a3.setOrigem("Salvador");
		a3.setDestino("Sao Paulo");
		a3.setData(new Date());
		a3.setAssento("30");
		a3.setPortao("C123");
		a3.setVoo("CD12");	
		System.out.println("> " + a3);	
	}
}
