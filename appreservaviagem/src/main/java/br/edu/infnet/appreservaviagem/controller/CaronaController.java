package br.edu.infnet.appreservaviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appreservaviagem.model.domain.Carona;
import br.edu.infnet.appreservaviagem.model.service.CaronaService;

@Controller
public class CaronaController {
	@Autowired
	private CaronaService caronaService;
	
	@GetMapping(value = "/carona")
	public String telaCadastro() {						
		return "carona/cadastro";
	}
	
	@PostMapping(value = "/carona/incluir")
	public String incluir(Carona carona) {
		caronaService.incluir(carona);
		
		return "redirect:/carona/lista";
	}
	
	@GetMapping(value = "/carona/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", caronaService.obterLista());
		
		return "carona/lista";
	}
	
	@GetMapping(value = "/carona/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		caronaService.excluir(id);
		return "redirect:/carona/lista";
	}
}
