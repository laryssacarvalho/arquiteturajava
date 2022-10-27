package br.edu.infnet.appreservaviagem.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;

@Controller
public class AviaoController {
	
	@GetMapping(value = "/aviao/lista")
	public String telaLista(Model model) {				
		Aviao a1 = new Aviao();
		a1.setOrigem("Salvador");
		a1.setDestino("Rio de Janeiro");
		a1.setData(new Date());
		a1.setAssento("12");
		a1.setPortao("A123");
		a1.setVoo("AB12");
		
		Aviao a2 = new Aviao();
		a2.setOrigem("Sao Paulo");
		a2.setDestino("Navegantes");
		a2.setData(new Date());
		a2.setAssento("02");
		a2.setPortao("B123");
		a2.setVoo("BC12");
				
		Aviao a3 = new Aviao();
		a3.setOrigem("Salvador");
		a3.setDestino("Sao Paulo");
		a3.setData(new Date());
		a3.setAssento("30");
		a3.setPortao("C123");
		a3.setVoo("CD12");	
		
		List<Aviao> avioes = new ArrayList<Aviao>();
		avioes.add(a1);
		avioes.add(a2);
		avioes.add(a3);
		
		model.addAttribute("listagem", avioes);
		
		return "aviao/lista";
	}
}
