package br.edu.infnet.appreservaviagem.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreservaviagem.model.domain.Viajante;

@Controller
public class ViajanteController {
	private static Map<Integer, Viajante> mapa = new HashMap<Integer, Viajante>();
	
	private static Integer id = 1;
	
	public static void incluir(Viajante viajante) {
		viajante.setId(id++);
		mapa.put(viajante.getId(), viajante);		
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);	
	}
	
	public static Collection<Viajante> obterLista() {
		return mapa.values();	
	}
	
	@GetMapping(value = "/viajante/lista")
	public String telaLista(Model model) {				
		model.addAttribute("listagem", obterLista());
		
		return "viajante/lista";
	}
	
	@GetMapping(value = "/viajante/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		excluir(id);
		return "redirect:/viajante/lista";
	}
}
