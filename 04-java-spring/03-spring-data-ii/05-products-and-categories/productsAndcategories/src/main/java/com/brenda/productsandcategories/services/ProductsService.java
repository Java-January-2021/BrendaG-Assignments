package com.brenda.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenda.productsandcategories.models.Categories;
import com.brenda.productsandcategories.models.Products;
import com.brenda.productsandcategories.repositories.ProductsRepository;

@Service
public class ProductsService {
	@Autowired 
	private ProductsRepository pRepo;
	
	public Products getProducts(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Products> getAllProducts(){
		return this.pRepo.findAll();
	}
	public Products createProduct(Products p) {
		return this.pRepo.save(p);
	}
	
	public List<Products> findProductsNotInCategory(Categories category) {
		return pRepo.findByCategoriesNotContains(category);
	}
	
	public void addCategory(Categories category, Products product) {
		List<Categories> categories = product.getCategories();
		categories.add(category);
		this.pRepo.save(product);
		
	}
}
