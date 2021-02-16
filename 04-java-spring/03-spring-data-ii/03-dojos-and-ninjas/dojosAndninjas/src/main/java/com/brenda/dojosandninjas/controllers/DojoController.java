package com.brenda.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brenda.dojosandninjas.models.Dojo;
import com.brenda.dojosandninjas.models.Ninja;
import com.brenda.dojosandninjas.services.DojoService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	@Autowired
	private DojoService dService;
	
	@GetMapping("/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "new.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		}else {
			dService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
	
	@GetMapping("/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("dojo") Ninja ninja) {
		viewModel.addAttribute("dojo", this.dService.getDojo(id));
		return "show.jsp";
	}
}
