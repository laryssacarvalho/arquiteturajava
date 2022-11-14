package br.edu.infnet.appreservaviagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appreservaviagem.model.domain.Reserva;
import br.edu.infnet.appreservaviagem.model.domain.Usuario;
import br.edu.infnet.appreservaviagem.model.service.PassagemService;
import br.edu.infnet.appreservaviagem.model.service.ReservaService;
import br.edu.infnet.appreservaviagem.model.service.ViajanteService;

@Controller
public class ReservaController {
	@Autowired
	private ReservaService reservaService;
	
	@Autowired
	private ViajanteService viajanteService;
	
	@Autowired
	private PassagemService passagemService;
	
	@GetMapping(value = "/reserva")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {			
		model.addAttribute("viajantes", viajanteService.obterLista(usuario));

		model.addAttribute("passagens", passagemService.obterLista(usuario));
		
		return "reserva/cadastro";
	}
	
	@PostMapping(value = "/reserva/incluir")
	public String incluir(Reserva reserva, @SessionAttribute("user") Usuario usuario) {
		System.out.println("Viajante: " + reserva.getViajante());		
		System.out.println("Passagens: " + reserva.getPassagens());
		
		reserva.setUsuario(usuario);
		
		reservaService.incluir(reserva);
		
		return "redirect:/reserva/lista";
	}
	
	@GetMapping(value = "/reserva/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {		
		model.addAttribute("listagem", reservaService.obterLista(usuario));
		
		return "reserva/lista";
	}
	
	@GetMapping(value = "/reserva/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		reservaService.excluir(id);
		return "redirect:/reserva/lista";
	}
	
}
