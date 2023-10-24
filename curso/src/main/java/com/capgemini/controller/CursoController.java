package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.model.Curso;
import com.capgemini.service.CursoService;

@Controller
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		return findPaginated(1,"nombreCurso","asc", model);
	}
	
	public String saveCurso() {
		return null;
	}
	
	public String deleteCurso() {
		return null;
	}
	
	public String showFormForUpdate() {
		return null;
	}
	
	public String showNewCursoForm() {
		return null;
	}
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(
			@PathVariable(value="pageNo") int pageNo,
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model
			) {
		int pageSize=4;
		Page<Curso> page=cursoService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Curso> listCursos=page.getContent();
		
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("sortField", sortField);
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("listCurses", listCursos);
		model.addAttribute("reverseSortDir", sortDir.equals("asc")?"desc":"asc");
		
		return "index";
	}
}
