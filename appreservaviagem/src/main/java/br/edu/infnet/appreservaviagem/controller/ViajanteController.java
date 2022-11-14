package br.edu.infnet.appreservaviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appreservaviagem.model.domain.Usuario;
import br.edu.infnet.appreservaviagem.model.domain.Viajante;
import br.edu.infnet.appreservaviagem.model.service.ViajanteService;

@Controller
public class ViajanteController {	
	@Autowired
	private ViajanteService viajanteService;
	
	@GetMapping(value = "/viajante/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {				
		model.addAttribute("listagem", viajanteService.obterLista(usuario));
		
		return "viajante/lista";
	}
	
	@GetMapping(value = "/viajante")
	public String telaCadastro() {		
		return "viajante/cadastro";
	}
	
	@PostMapping(value = "/viajante/incluir")
	public String incluir(Viajante viajante, @SessionAttribute("user") Usuario usuario) {
		viajante.setUsuario(usuario);
		viajanteService.incluir(viajante);
		
		return "redirect:/viajante/lista";
	}
	
	@GetMapping(value = "/viajante/{id}/excluir")
	public String excluir(@PathVariable Integer id) {	
		viajanteService.excluir(id);
		return "redirect:/viajante/lista";
	}
}
