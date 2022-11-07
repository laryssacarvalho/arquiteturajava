package br.edu.infnet.appreservaviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appreservaviagem.model.domain.Reserva;
import br.edu.infnet.appreservaviagem.model.service.ReservaService;

@Controller
public class ReservaController {
	@Autowired
	private ReservaService reservaService;
	
	@GetMapping(value = "/reserva")
	public String telaCadastro() {						
		return "reserva/cadastro";
	}
	
	@PostMapping(value = "/reserva/incluir")
	public String incluir(Reserva reserva) {
		reservaService.incluir(reserva);
		
		return "redirect:/reserva/lista";
	}
	
	@GetMapping(value = "/reserva/lista")
	public String telaLista(Model model) {				
		model.addAttribute("listagem", reservaService.obterLista());
		
		return "reserva/lista";
	}
	
	@GetMapping(value = "/reserva/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		reservaService.excluir(id);
		return "redirect:/reserva/lista";
	}
	
}
