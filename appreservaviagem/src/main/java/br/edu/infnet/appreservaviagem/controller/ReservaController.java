package br.edu.infnet.appreservaviagem.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreservaviagem.model.domain.Reserva;

@Controller
public class ReservaController {
	private static Map<Integer, Reserva> mapa = new HashMap<Integer, Reserva>();
	
	private static Integer id = 1;
	
	public static void incluir(Reserva reserva) {
		reserva.setId(id++);
		mapa.put(reserva.getId(), reserva);		
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);	
	}
	
	public static Collection<Reserva> obterLista() {
		return mapa.values();	
	}
	
	@GetMapping(value = "/reserva/lista")
	public String telaLista(Model model) {				
		model.addAttribute("listagem", obterLista());
		
		return "reserva/lista";
	}
	
	@GetMapping(value = "/reserva/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		excluir(id);
		return "redirect:/reserva/lista";
	}
}
