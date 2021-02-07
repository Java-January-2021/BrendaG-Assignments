package com.brenda.languages.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.brenda.languages.models.Language;
import com.brenda.languages.services.LanguageService;

@Controller
public class LanguagesController {
	@Autowired
	private LanguageService lService;
	
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("languages", this.lService.allLanguages());
		return "index.jsp";
	}
	@RequestMapping("/{id}/show")
	public String Show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", lService.findLanguage(id));
		return "show.jsp";
	}
	@RequestMapping("/new")
	public String New(@ModelAttribute("language") Language language) {
		return "new.jsp";
	}
	@RequestMapping(value="", method=RequestMethod.POST)
	public String Create(@Valid @ModelAttribute("language") Language lang, BindingResult result, @RequestParam Map<String,String> body) {
		if(result.hasErrors())
			return "new.jsp";
		lService.createLanguage(lang);
		return "redirect:/";
	}
	@RequestMapping("/{id}/edit")
	public String Edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", lService.findLanguage(id));
		return "edit.jsp";
	}
	@RequestMapping(value="/{id}/update", method=RequestMethod.POST)
	public String Update(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
		if(result.hasErrors())
			return "edit.jsp";
		lService.updateLanguage(lang);
		return "redirect:/";
	}
	@GetMapping("/{id}/delete")
	public String Delete(@PathVariable("id") Long id) {
		this.lService.deleteById(id);
		return "redirect:/";

	}
}
