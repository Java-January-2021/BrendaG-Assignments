package com.brenda.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenda.productsandcategories.models.Categories;
import com.brenda.productsandcategories.models.Products;
import com.brenda.productsandcategories.repositories.CategoriesRepository;

@Service
public class CategoriesService {
	@Autowired
	private CategoriesRepository cRepo;
	
	public Categories getCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public List<Categories> getCategories(){
		return this.cRepo.findAll();
	}
	
	public Categories createCategory(Categories c) {
		return this.cRepo.save(c);
	}
	public List<Categories> findCategoriesNotInProduct(Products product) {
		return cRepo.findByProductsNotContains(product);
	}
	
	public void addProductToCategory(Products product, Categories category) {
		List<Products> products = category.getProducts();
		products.add(product);
		this.cRepo.save(category);
	}
}
