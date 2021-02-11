package com.brenda.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.brenda.driverslicense.models.License;
import com.brenda.driverslicense.models.Person;
import com.brenda.driverslicense.services.DMVService;

@Controller
public class HomeController {
	private final DMVService service;
	public HomeController(DMVService serv) {
		this.service = serv;
	}
	@GetMapping("/")
	public String Index(Model model) {
		List<Person> people = service.getPeople();
		model.addAttribute("persons", people);
		return "index.jsp";
	}
	@PostMapping("/")
	public String CreatePerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors() ) {
			return "new.jsp";
		}
		service.createPerson(person);
		return "redirect:/";
	}
	@GetMapping("/{id}")
	public String ShowPerson(@PathVariable("id") Long id, Model viewModel ,@ModelAttribute("license") License lic ) {
		Person person = this.service.getPerson(id);
		viewModel.addAttribute("person", person);
		System.out.println(person);
		return "show.jsp";
	}
	@GetMapping("/new")
	public String NewPerson(@ModelAttribute("person") Person person) {
		return "new.jsp";
	}
	@GetMapping("/licenses/new")
	public String NewLicense(@ModelAttribute("license") License lic, Model model) {
		List<Person> unlicensed = service.getUnlicensedPeople();
		model.addAttribute("persons", unlicensed);
		return "/licenses/new.jsp";
	}
	@PostMapping( "/licenses")
	public String CreateLicense(@Valid @ModelAttribute("license") License lic, BindingResult result) {
		if(result.hasErrors()){
			return "/licenses/new.jsp";
		}else {
		service.createLicense(lic);
		return "redirect:/";
		}
	}
}