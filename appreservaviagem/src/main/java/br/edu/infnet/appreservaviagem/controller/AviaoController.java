package br.edu.infnet.appreservaviagem.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreservaviagem.model.domain.Aviao;

@Controller
public class AviaoController {
	private static Map<Integer, Aviao> mapa = new HashMap<Integer, Aviao>();
	
	private static Integer id = 1;
	
	public static void incluir(Aviao aviao) {
		aviao.setId(id++);
		mapa.put(aviao.getId(), aviao);		
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);	
	}
	
	public static Collection<Aviao> obterLista() {
		return mapa.values();	
	}
	
	@GetMapping(value = "/aviao/lista")
	public String telaLista(Model model) {						
		model.addAttribute("listagem", obterLista());
		
		return "aviao/lista";
	}
	
	@GetMapping(value = "/aviao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {	
		excluir(id);
		return "redirect:/aviao/lista";
	}
}
