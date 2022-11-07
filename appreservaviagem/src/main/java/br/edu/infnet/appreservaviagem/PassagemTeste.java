package br.edu.infnet.appreservaviagem;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;
import br.edu.infnet.appreservaviagem.model.domain.Carona;
import br.edu.infnet.appreservaviagem.model.domain.Onibus;
import br.edu.infnet.appreservaviagem.model.service.PassagemService;

@Order(4)
@Component
public class PassagemTeste implements ApplicationRunner{
	@Autowired
	private PassagemService passagemService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Passagens ##");
		
		Aviao a1 = new Aviao();
		a1.setOrigem("Salvador");
		a1.setDestino("Rio de Janeiro");
		a1.setData(new Date());
		a1.setAssento("10");
		a1.setPortao("AB12");
		a1.setVoo("4567");
		System.out.println("> " + a1);
		passagemService.incluir(a1);
		
		Onibus o1 = new Onibus();
		o1.setOrigem("Curitiba");
		o1.setDestino("Sao Paulo");
		o1.setData(new Date());
		o1.setLinha("CURITIBA - SAO PAULO");
		o1.setPlataforma("20");
		o1.setPoltrona("02");		
		System.out.println("> " + o1);
		passagemService.incluir(o1);
		
		Carona c1 = new Carona();
		c1.setOrigem("Tatui");
		c1.setDestino("Sorocaba");
		c1.setData(new Date());
		c1.setMarca("Ford");
		c1.setModelo("Ka");
		c1.setPlaca("AAA1B12");
		System.out.println("> " + c1);		
		passagemService.incluir(c1);
	}
	
}
