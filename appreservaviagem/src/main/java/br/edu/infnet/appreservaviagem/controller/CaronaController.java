package br.edu.infnet.appreservaviagem.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;
import br.edu.infnet.appreservaviagem.model.domain.Carona;

@Controller
public class CaronaController {
	
	@GetMapping(value = "/carona/lista")
	public String telaLista(Model model) {
		Carona c1 = new Carona();
		c1.setOrigem("Tatui");
		c1.setDestino("Sorocaba");
		c1.setData(new Date());
		c1.setMarca("Ford");
		c1.setModelo("Ka");
		c1.setPlaca("AAA1B12");
		
		Carona c2 = new Carona();
		c2.setOrigem("Sorocaba");
		c2.setDestino("Itu");
		c2.setData(new Date());
		c2.setMarca("Renault");
		c2.setModelo("Kwid");
		c2.setPlaca("BBB1C12");		
				
		Carona c3 = new Carona();
		c3.setOrigem("Itu");
		c3.setDestino("Indaiatuba");
		c3.setData(new Date());
		c3.setMarca("Fiat");
		c3.setModelo("Mobi");
		c3.setPlaca("CCC1D12");		
		
		List<Carona> caronas = new ArrayList<Carona>();
		caronas.add(c1);
		caronas.add(c2);
		caronas.add(c3);
		
		model.addAttribute("listagem", caronas);
		
		return "carona/lista";
	}
}
