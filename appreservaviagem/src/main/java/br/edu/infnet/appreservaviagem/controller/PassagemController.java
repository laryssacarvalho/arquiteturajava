package br.edu.infnet.appreservaviagem.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreservaviagem.model.domain.Passagem;

@Controller
public class PassagemController {
	private static Map<Integer, Passagem> mapa = new HashMap<Integer, Passagem>();
	
	private static Integer id = 1;
	
	public static void incluir(Passagem passagem) {
		passagem.setId(id++);
		mapa.put(passagem.getId(), passagem);		
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);	
	}
	
	public static Collection<Passagem> obterLista() {
		return mapa.values();	
	}
	
	@GetMapping(value = "/passagem/lista")
	public String telaLista(Model model) {				
		model.addAttribute("listagem", obterLista());
		
		return "passagem/lista";
	}
	
	@GetMapping(value = "/passagem/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		excluir(id);
		return "redirect:/passagem/lista";
	}
}
