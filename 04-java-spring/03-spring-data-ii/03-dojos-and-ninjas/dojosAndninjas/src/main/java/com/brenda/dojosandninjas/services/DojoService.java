package com.brenda.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenda.dojosandninjas.models.Dojo;
import com.brenda.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dRepo;
	
	public Dojo getDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	public List<Dojo> getDojos(){
		return this.dRepo.findAll();
	}
	
	public Dojo createDojo(Dojo d) {
		return this.dRepo.save(d);
	}
}
