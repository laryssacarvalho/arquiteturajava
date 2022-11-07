package br.edu.infnet.appreservaviagem;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Carona;
import br.edu.infnet.appreservaviagem.model.service.CaronaService;

@Order(6)
@Component
public class CaronaTeste implements ApplicationRunner {
	@Autowired
	private CaronaService caronaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Passagens de Carona ##");
		
		Carona c1 = new Carona();
		c1.setOrigem("Tatui");
		c1.setDestino("Sorocaba");
		c1.setData(new Date());
		c1.setMarca("Ford");
		c1.setModelo("Ka");
		c1.setPlaca("AAA1B12");
		System.out.println("> " + c1);
		caronaService.incluir(c1);
		
		Carona c2 = new Carona();
		c2.setOrigem("Sorocaba");
		c2.setDestino("Itu");
		c2.setData(new Date());
		c2.setMarca("Renault");
		c2.setModelo("Kwid");
		c2.setPlaca("BBB1C12");		
		System.out.println("> " + c2);
		caronaService.incluir(c2);
		
		Carona c3 = new Carona();
		c3.setOrigem("Itu");
		c3.setDestino("Indaiatuba");
		c3.setData(new Date());
		c3.setMarca("Fiat");
		c3.setModelo("Mobi");
		c3.setPlaca("CCC1D12");		
		System.out.println("> " + c3);		
		caronaService.incluir(c3);
	}
}
