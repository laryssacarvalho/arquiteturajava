package br.edu.infnet.appreservaviagem.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;
import br.edu.infnet.appreservaviagem.model.domain.Carona;
import br.edu.infnet.appreservaviagem.model.domain.Onibus;
import br.edu.infnet.appreservaviagem.model.domain.Passagem;

@Controller
public class PassagemController {
	
	@GetMapping(value = "/passagem/lista")
	public String telaLista(Model model) {
		Aviao a1 = new Aviao();
		a1.setOrigem("Salvador");
		a1.setDestino("Rio de Janeiro");
		a1.setData(new Date());
		a1.setAssento("10");
		a1.setPortao("AB12");
		a1.setVoo("4567");
		
		Onibus o1 = new Onibus();
		o1.setOrigem("Curitiba");
		o1.setDestino("Sao Paulo");
		o1.setData(new Date());
		o1.setLinha("CURITIBA - SAO PAULO");
		o1.setPlataforma("20");
		o1.setPoltrona("02");		
				
		Carona c1 = new Carona();
		c1.setOrigem("Tatui");
		c1.setDestino("Sorocaba");
		c1.setData(new Date());
		c1.setMarca("Ford");
		c1.setModelo("Ka");
		c1.setPlaca("AAA1B12");
		
		List<Passagem> passagens = new ArrayList<Passagem>();
		passagens.add(a1);
		passagens.add(o1);
		passagens.add(c1);
		
		model.addAttribute("listagem", passagens);
		
		return "passagem/lista";
	}
}
