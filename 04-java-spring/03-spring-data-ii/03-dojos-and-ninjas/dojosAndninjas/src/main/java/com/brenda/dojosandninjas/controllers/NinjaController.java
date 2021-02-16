package com.brenda.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brenda.dojosandninjas.models.Ninja;
import com.brenda.dojosandninjas.services.DojoService;
import com.brenda.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	@Autowired
	private NinjaService nService;
	@Autowired
	private DojoService dSevice;
	
	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("dojos", this.dSevice.getDojos());
		return"newNinja.jsp";
	}
	
	@PostMapping("/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja,BindingResult result,Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("dojos", this.dSevice.getDojos());
			return "newNinja.jsp";
		}else {
			this.nService.createNinja(ninja);
			return"redirect:/ninjas/new";
		}
	}
}
