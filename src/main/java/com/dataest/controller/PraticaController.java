package com.dataest.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dataest.model.PraticaEstatistica;
import com.dataest.model.ProjetoEstatistica;

@Controller
@RequestMapping("/pesquisas")
public class PraticaController {

	private static final String CREATE_SUCCESS = "Pesquisa cadastrado com sucesso!";
	private static final String CREATE_ERROR = "Não foi possível cadastrar pesquisa!";
	private static final String UPDATE_SUCCESS = "Pesquisa editado com sucesso!";
	private static final String UPDATE_ERROR = "Não foi possível editar pesquisa!";
	private static final String DELETE_SUCCESS = "Pesquisa removido com sucesso!";
	private static final String DELETE_ERROR = "Não foi possível remover pesquisa!";
	
	private static final String LIST_ERROR = "Não foi possível listar pesquisas!";
	
	@GetMapping
	public String index(Model model) {
		/* List practices here */
		List<PraticaEstatistica> pesquisas = new ArrayList<>();
		for(int i = 1; i <= 10; i++)
			pesquisas.add(new PraticaEstatistica(i, Date.valueOf("2018-11-"+(i+10)), Date.valueOf("2018-11-"+(i+20)), null, null, null));
		
		
		/* Add practices list to model */
		model.addAttribute("pesquisas", pesquisas);
		return "pesquisa/index";
	}
	
	@GetMapping("/cadastrar")
	public String getRegister(@ModelAttribute("pesquisa") PraticaEstatistica pesquisa) {
		return "pesquisa/form";
	}
	
	
	@PostMapping
	public String postRegister(PraticaEstatistica pesquisa, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("sucesso", CREATE_SUCCESS);
		return "redirect:/pesquisas";
	}
	
	@GetMapping("/{id}/editar")
	public String getEdit(@PathVariable("id") Integer id, Model model) {
		// search practices by id
		PraticaEstatistica pesquisa = new PraticaEstatistica();
		pesquisa.setCodigo(id);
			
		model.addAttribute("pesquisa", pesquisa);
		return "pesquisa/form";
	}
	
	@PutMapping
	public String putEdit(PraticaEstatistica pesquisa, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("sucesso", UPDATE_SUCCESS);
		return "redirect:/pesquisas";
	}
	
	@GetMapping("/buscar")
	public String getSearch(@ModelAttribute("filtro") PraticaEstatistica filtro) {
		return "pesquisa/search";
	}
	
	@PostMapping("/buscar")
	public String postSearch(PraticaEstatistica filtro, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("filtro", filtro);
		
		/* Search for practices here */
		
		List<PraticaEstatistica> pesquisas = new ArrayList<>();
		for(int i = 1; i <= 10; i++)
			pesquisas.add(new PraticaEstatistica(i, Date.valueOf("2018-11-"+(i+10)), Date.valueOf("2018-11-"+(i+20)), null, null, null));
		redirectAttributes.addFlashAttribute("pesquisas", pesquisas);
		return "redirect:/pesquisas/buscar";
	}
	
	@GetMapping("/{id}/apagar")
	public String delete(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("sucesso", DELETE_SUCCESS);
		return "redirect:/pesquisas";
	}
}
