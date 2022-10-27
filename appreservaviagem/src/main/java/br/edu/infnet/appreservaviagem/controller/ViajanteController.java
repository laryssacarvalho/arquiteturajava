package br.edu.infnet.appreservaviagem.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreservaviagem.model.domain.Viajante;

@Controller
public class ViajanteController {
	
	@GetMapping(value = "/viajante/lista")
	public String telaLista(Model model) {
		Viajante v1 = new Viajante();
		v1.setNome("Maria Silva");
		v1.setDocumento("111.222.333-44");
		v1.setDataNascimento(new Date());
		
		Viajante v2 = new Viajante();
		v2.setNome("João Souza");
		v2.setDocumento("222.333.444-55");
		v2.setDataNascimento(new Date());
				
		Viajante v3 = new Viajante();
		v3.setNome("Pedro Camargo");
		v3.setDocumento("333.444.555-66");
		v3.setDataNascimento(new Date());
		
		List<Viajante> viajantes = new ArrayList<Viajante>();
		viajantes.add(v1);
		viajantes.add(v2);
		viajantes.add(v3);
		
		model.addAttribute("listagem", viajantes);
		
		return "viajante/lista";
	}
}
