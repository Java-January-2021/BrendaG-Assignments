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
@RequestMapping("/products")
public class ProductsController {
	@Autowired
	private ProductsService pService;
	@Autowired
	private CategoriesService cService;
	
	@GetMapping("/new")
	public String newProduct(@ModelAttribute("product") Products product, Model viewModel) {
		return "newProduct.jsp";
	}
	
	@PostMapping("/new")
	public String createProduct(@Valid @ModelAttribute("product") Products product, BindingResult result, Model viewModel) {
		if (result.hasErrors()) {
			return "newProduct.jsp";
		}else {
			this.pService.createProduct(product);
			return "redirect:/products/new";
		}
	}
	@GetMapping("/{id}")
	public String Show(@ModelAttribute("product") Products product,@PathVariable("id") Long id, Model viewModel) {
		Products thisProduct = this.pService.getProducts(id);
		List<Categories> thisProductsCategory = thisProduct.getCategories();
		List<Categories> allCategories = this.cService.getCategories();
		List<Categories> others = this.cService.findCategoriesNotInProduct(thisProduct);
		viewModel.addAttribute("category", thisProductsCategory);
		viewModel.addAttribute("allCAtegories", allCategories);
		viewModel.addAttribute("product", thisProduct);
		viewModel.addAttribute("notInProducts", others);		
		return "showProduct.jsp";
	}
	@PostMapping("/{id}")
	public String addCategory(@RequestParam("category")Long categoryId,@PathVariable("id")Long id) {
		Categories categoryToAdd = this.cService.getCategory(categoryId);
		Products thisProduct = this.pService.getProducts(id);
		this.pService.addCategory(categoryToAdd, thisProduct);
		return "redirect:/products/{id}";
	}
}




