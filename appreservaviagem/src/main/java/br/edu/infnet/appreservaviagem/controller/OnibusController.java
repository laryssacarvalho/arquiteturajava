package br.edu.infnet.appreservaviagem.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreservaviagem.model.domain.Onibus;

@Controller
public class OnibusController {
	private static Map<Integer, Onibus> mapa = new HashMap<Integer, Onibus>();
	
	private static Integer id = 1;
	
	public static void incluir(Onibus o) {
		o.setId(id++);
		mapa.put(o.getId(), o);		
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);	
	}
	
	public static Collection<Onibus> obterLista() {
		return mapa.values();	
	}
	
	@GetMapping(value = "/onibus/lista")
	public String telaLista(Model model) {		
		model.addAttribute("listagem", obterLista());
		
		return "onibus/lista";
	}
	
	@GetMapping(value = "/onibus/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		excluir(id);
		return "redirect:/onibus/lista";
	}
}
