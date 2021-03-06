package com.dataest.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
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

import com.dataest.model.ProjetoEstatistica;

@Controller
@RequestMapping("/projetos")
public class ProjetoController {
	
	private static final String CREATE_SUCCESS = "Projeto cadastrado com sucesso!";
	private static final String CREATE_ERROR = "Não foi possível cadastrar projeto!";
	private static final String UPDATE_SUCCESS = "Projeto editado com sucesso!";
	private static final String UPDATE_ERROR = "Não foi possível editar projeto!";
	private static final String DELETE_SUCCESS = "Projeto removido com sucesso!";
	private static final String DELETE_ERROR = "Não foi possível remover projeto!";
	
	private static final String LIST_ERROR = "Não foi possível listar projetos!";
	
	@GetMapping
	public String index(Model model) {
		/* List projects here */
		List<ProjetoEstatistica> projetos = new ArrayList<>();
		for(int i = 1; i <= 10; i++)
			projetos.add(new ProjetoEstatistica(i, "Projeto " + i, 
					Date.valueOf("2018-11-"+(i+10)), 
					Date.valueOf("2018-11-"+(i+20)), 
					null, "Órgão "+i, "Coordenador "+ i));
		
		
		/* Add project list to model */
		model.addAttribute("projetos", projetos);
		return "projeto/index";
	}
	
	@GetMapping("/cadastrar")
	public String getRegister(@ModelAttribute("projeto") ProjetoEstatistica projeto) {
		return "projeto/form";
	}
	
	@PostMapping
	public String postRegister(ProjetoEstatistica projeto, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("sucesso", CREATE_SUCCESS);
		return "redirect:/projetos";
	}
	
	@GetMapping("/{id}/editar")
	public String getEdit(@PathVariable("id") Integer id, Model model) {
		// search project by id
		ProjetoEstatistica projeto = new ProjetoEstatistica();
		projeto.setCodigo(id);
			
		model.addAttribute("projeto", projeto);
		return "projeto/form";
	}
	
	@PutMapping
	public String putEdit(ProjetoEstatistica projeto, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("sucesso", UPDATE_SUCCESS);
		return "redirect:/projetos";
	}
	
	@GetMapping("/buscar")
	public String getSearch(@ModelAttribute("filtro") ProjetoEstatistica filtro) {
		return "projeto/search";
	}
	
	@PostMapping("/buscar")
	public String postSearch(ProjetoEstatistica filtro, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("filtro", filtro);
		
		/* Search for Projects here */
		
		List<ProjetoEstatistica> projetos = new ArrayList<>();
		for(int i = 1; i <= 10; i++)
			projetos.add(new ProjetoEstatistica(i, "Projeto " + i, 
					Date.valueOf("2018-11-"+(i+10)), 
					Date.valueOf("2018-11-"+(i+20)), 
					null, "Órgão "+i, "Coordenador "+ i));
		redirectAttributes.addFlashAttribute("projetos", projetos);
		return "redirect:/projetos/buscar";
	}
	
	@GetMapping("/{id}/apagar")
	public String delete(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("sucesso", DELETE_SUCCESS);
		return "redirect:/projetos";
	}
}
