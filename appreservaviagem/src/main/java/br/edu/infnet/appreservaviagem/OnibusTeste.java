package br.edu.infnet.appreservaviagem;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Onibus;

@Component
public class OnibusTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Onibus o1 = new Onibus();
		o1.linha = "RIO DE JANEIRO - SOROCABA";
		o1.plataforma = "12";
		o1.poltrona = "40";
		System.out.println("Onibus - " + o1);
		
		Onibus o2 = new Onibus();
		o2.linha = "SOROCABA - TATUI";
		o2.plataforma = "01";
		o2.poltrona = "20";
		System.out.println("Onibus - " + o2);
				
		Onibus o3 = new Onibus();
		o3.linha = "TATUI - SAO PAULO";
		o3.plataforma = "08";
		o3.poltrona = "11";		
		System.out.println("Onibus - " + o3);	
	}
}
