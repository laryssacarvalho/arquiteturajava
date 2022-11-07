package br.edu.infnet.appreservaviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appreservaviagem.model.domain.Onibus;
import br.edu.infnet.appreservaviagem.model.service.OnibusService;

@Controller
public class OnibusController {
	@Autowired
	private OnibusService onibusService;
	
	@GetMapping(value = "/onibus")
	public String telaCadastro() {						
		return "onibus/cadastro";
	}
	
	@PostMapping(value = "/onibus/incluir")
	public String incluir(Onibus onibus) {
		onibusService.incluir(onibus);
		
		return "redirect:/onibus/lista";
	}
	
	@GetMapping(value = "/onibus/lista")
	public String telaLista(Model model) {		
		model.addAttribute("listagem", onibusService.obterLista());
		
		return "onibus/lista";
	}
	
	@GetMapping(value = "/onibus/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		onibusService.excluir(id);
		return "redirect:/onibus/lista";
	}
}
