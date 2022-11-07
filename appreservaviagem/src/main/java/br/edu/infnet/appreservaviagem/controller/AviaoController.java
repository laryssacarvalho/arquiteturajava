package br.edu.infnet.appreservaviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;
import br.edu.infnet.appreservaviagem.model.service.AviaoService;

@Controller
public class AviaoController {
	@Autowired
	private AviaoService aviaoService;
	
	@GetMapping(value = "/aviao")
	public String telaCadastro() {						
		return "aviao/cadastro";
	}
	
	@PostMapping(value = "/aviao/incluir")
	public String incluir(Aviao aviao) {
		aviaoService.incluir(aviao);
		
		return "redirect:/aviao/lista";
	}
	
	@GetMapping(value = "/aviao/lista")
	public String telaLista(Model model) {						
		model.addAttribute("listagem", aviaoService.obterLista());
		
		return "aviao/lista";
	}
	
	@GetMapping(value = "/aviao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {	
		aviaoService.excluir(id);
		return "redirect:/aviao/lista";
	}	
}
