package br.edu.infnet.appreservaviagem.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;
import br.edu.infnet.appreservaviagem.model.domain.Onibus;

@Controller
public class OnibusController {
	
	@GetMapping(value = "/onibus/lista")
	public String telaLista(Model model) {
		Onibus o1 = new Onibus();
		o1.setOrigem("Rio de Janeiro");
		o1.setDestino("Sorocaba");
		o1.setData(new Date());
		o1.setLinha("RIO DE JANEIRO - SOROCABA");
		o1.setPlataforma("12");
		o1.setPoltrona("40");
		
		Onibus o2 = new Onibus();
		o2.setOrigem("Sorocaba");
		o2.setDestino("Tatui");
		o2.setData(new Date());
		o2.setLinha("SOROCABA - TATUI");
		o2.setPlataforma("01");
		o2.setPoltrona("20");
				
		Onibus o3 = new Onibus();
		o3.setOrigem("Tatui");
		o3.setDestino("Sao Paulo");
		o3.setData(new Date());
		o3.setLinha("TATUI - SAO PAULO");
		o3.setPlataforma("08");
		o3.setPoltrona("11");	
		
		List<Onibus> onibus = new ArrayList<Onibus>();
		onibus.add(o1);
		onibus.add(o2);
		onibus.add(o3);
		
		model.addAttribute("listagem", onibus);
		
		return "onibus/lista";
	}
}
