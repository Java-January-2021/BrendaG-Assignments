package com.brenda.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenda.languages.models.Language;
import com.brenda.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	private LanguageRepository lRepo;
	
	public List<Language> allLanguages() {
		return lRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		return lRepo.findById(id).orElse(null);
	}
	public Language createLanguage(Language lang) {
		return lRepo.save(lang);
	}
	
	public Language updateLanguage(Language lang) {
		return this.lRepo.save(lang);
	}
	
	public void deleteById(Long id) {
		this.lRepo.deleteById(id);
	}
}
