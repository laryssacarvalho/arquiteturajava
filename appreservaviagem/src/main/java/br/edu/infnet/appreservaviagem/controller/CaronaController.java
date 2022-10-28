package br.edu.infnet.appreservaviagem.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreservaviagem.model.domain.Carona;

@Controller
public class CaronaController {
	private static Map<Integer, Carona> mapa = new HashMap<Integer, Carona>();
	
	private static Integer id = 1;
	
	public static void incluir(Carona carona) {
		carona.setId(id++);
		mapa.put(carona.getId(), carona);		
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);	
	}
	
	public static Collection<Carona> obterLista() {
		return mapa.values();	
	}
	
	@GetMapping(value = "/carona/lista")
	public String telaLista(Model model) {		
		
		model.addAttribute("listagem", obterLista());
		
		return "carona/lista";
	}
	
	@GetMapping(value = "/carona/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		excluir(id);
		return "redirect:/carona/lista";
	}
}
