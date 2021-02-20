package com.brenda.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brenda.productsandcategories.models.Categories;
import com.brenda.productsandcategories.models.Products;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Long> {
	List<Products> findAll();
	List<Products> findByCategoriesNotContains(Categories category);

}
