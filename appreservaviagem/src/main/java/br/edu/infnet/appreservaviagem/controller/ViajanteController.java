package br.edu.infnet.appreservaviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreservaviagem.model.service.ViajanteService;

@Controller
public class ViajanteController {	
	@Autowired
	private ViajanteService viajanteService;
	
	@GetMapping(value = "/viajante/lista")
	public String telaLista(Model model) {				
		model.addAttribute("listagem", viajanteService.obterLista());
		
		return "viajante/lista";
	}
	
	@GetMapping(value = "/viajante/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		viajanteService.excluir(id);
		return "redirect:/viajante/lista";
	}
}
