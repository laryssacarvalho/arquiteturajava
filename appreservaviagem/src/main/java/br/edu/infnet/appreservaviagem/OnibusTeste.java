package br.edu.infnet.appreservaviagem;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Onibus;
import br.edu.infnet.appreservaviagem.model.service.OnibusService;

@Component
public class OnibusTeste implements ApplicationRunner {
	@Autowired
	private OnibusService onibusService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Passagens de Onibus ##");
		
		Onibus o1 = new Onibus();
		o1.setOrigem("Rio de Janeiro");
		o1.setDestino("Sorocaba");
		o1.setData(new Date());
		o1.setLinha("RIO DE JANEIRO - SOROCABA");
		o1.setPlataforma("12");
		o1.setPoltrona("40");
		System.out.println("> " + o1);
		onibusService.incluir(o1);
		
		Onibus o2 = new Onibus();
		o2.setOrigem("Sorocaba");
		o2.setDestino("Tatui");
		o2.setData(new Date());
		o2.setLinha("SOROCABA - TATUI");
		o2.setPlataforma("01");
		o2.setPoltrona("20");
		System.out.println("> " + o2);
		onibusService.incluir(o2);
		
		Onibus o3 = new Onibus();
		o3.setOrigem("Tatui");
		o3.setDestino("Sao Paulo");
		o3.setData(new Date());
		o3.setLinha("TATUI - SAO PAULO");
		o3.setPlataforma("08");
		o3.setPoltrona("11");	
		System.out.println("> " + o3);	
		onibusService.incluir(o3);
	}
}
