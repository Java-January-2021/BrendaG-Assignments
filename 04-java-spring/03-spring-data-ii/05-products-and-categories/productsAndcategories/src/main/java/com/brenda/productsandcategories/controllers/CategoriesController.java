package com.brenda.productsandcategories.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.brenda.productsandcategories.models.Categories;
import com.brenda.productsandcategories.models.Products;
import com.brenda.productsandcategories.services.CategoriesService;
import com.brenda.productsandcategories.services.ProductsService;

@Controller
@RequestMapping("/categories")
public class CategoriesController {
	@Autowired
	private CategoriesService cService;
	@Autowired
	private ProductsService pService;
	
	@GetMapping("/new")
	private String newCategory(@ModelAttribute("category") Categories category, Model viewModel) {
		return "newCategory.jsp";
	}
	@PostMapping("/new")
	public String createCategory(@Valid @ModelAttribute("category") Categories category, BindingResult result, Model viewModel) {
		if (result.hasErrors()) {
			return "newCategory.jsp";
		}else {
			this.cService.createCategory(category);
			return "redirect:/categories/new";
		}
			
	}
	@GetMapping("/{id}")
	public String Show(@ModelAttribute("category") Categories category,@PathVariable("id") Long id, Model viewModel) {
		Categories thisCategory = this.cService.getCategory(id);
		List<Products> thisCategoriesProducts = thisCategory.getProducts();
		List<Products> allProducts = this.pService.getAllProducts();
		List<Products> others = this.pService.findProductsNotInCategory(thisCategory);
		viewModel.addAttribute("products", thisCategoriesProducts);
		viewModel.addAttribute("allProducts", allProducts);
		viewModel.addAttribute("category", thisCategory);
		viewModel.addAttribute("notInCategories", others);		
		return "showCategory.jsp";
	}
	@PostMapping("/{id}")
	public String addProductToCategory(@RequestParam("product")Long productId,@PathVariable("id")Long id) {
		Products productToAdd = this.pService.getProducts(productId);
		Categories thisCategory = this.cService.getCategory(id);
		this.cService.addProductToCategory(productToAdd, thisCategory);
		return "redirect:/categories/{id}";
	}


	
}
