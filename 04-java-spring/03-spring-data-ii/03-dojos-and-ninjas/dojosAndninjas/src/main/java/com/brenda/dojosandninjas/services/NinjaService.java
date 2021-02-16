package com.brenda.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenda.dojosandninjas.models.Ninja;
import com.brenda.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository nRepo;
	
	public Ninja getNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
	public List<Ninja> getNinjas(){
		return this.nRepo.findAll();
	}
	
	public Ninja createNinja(Ninja n) {
		return this.nRepo.save(n);
	}
}
