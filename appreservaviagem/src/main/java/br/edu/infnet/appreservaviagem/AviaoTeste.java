package br.edu.infnet.appreservaviagem;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;
import br.edu.infnet.appreservaviagem.model.domain.Usuario;
import br.edu.infnet.appreservaviagem.model.service.AviaoService;

@Order(4)
@Component
public class AviaoTeste implements ApplicationRunner {
	@Autowired
	private AviaoService aviaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Passagens de Aviao ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Aviao a1 = new Aviao();
		a1.setOrigem("Salvador");
		a1.setDestino("Rio de Janeiro");
		a1.setData(new Date());
		a1.setAssento("12");
		a1.setPortao("A123");
		a1.setVoo("AB12");
		a1.setUsuario(usuario);
		
		System.out.println("> " + a1);		
		aviaoService.incluir(a1);
		
		Aviao a2 = new Aviao();
		a2.setOrigem("Sao Paulo");
		a2.setDestino("Navegantes");
		a2.setData(new Date());
		a2.setAssento("02");
		a2.setPortao("B123");
		a2.setVoo("BC12");
		a2.setUsuario(usuario);
		System.out.println("> " + a2);
		aviaoService.incluir(a2);
		
		Aviao a3 = new Aviao();
		a3.setOrigem("Salvador");
		a3.setDestino("Sao Paulo");
		a3.setData(new Date());
		a3.setAssento("30");
		a3.setPortao("C123");
		a3.setVoo("CD12");	
		a3.setUsuario(usuario);
		System.out.println("> " + a3);	
		aviaoService.incluir(a3);
	}
}
