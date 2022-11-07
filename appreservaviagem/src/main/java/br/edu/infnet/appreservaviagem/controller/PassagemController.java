package br.edu.infnet.appreservaviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreservaviagem.model.service.PassagemService;

@Controller
public class PassagemController {
	@Autowired
	private PassagemService passagemService;	
	
	@GetMapping(value = "/passagem/lista")
	public String telaLista(Model model) {				
		model.addAttribute("listagem", passagemService.obterLista());
		
		return "passagem/lista";
	}
	
	@GetMapping(value = "/passagem/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		passagemService.excluir(id);
		return "redirect:/passagem/lista";
	}
}
