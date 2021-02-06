package com.brenda.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brenda.books.models.Book;
import com.brenda.books.services.BookService;
@RestController
public class BooksApi {
	@Autowired
	 private  BookService bService;

	    @RequestMapping("/api/books")
	    public List<Book> index() {
	        return this.bService.allBooks();
	    }
	    
	    @RequestMapping(value="/api/books", method=RequestMethod.POST)
	    public Book create(Book book) {
	        return this.bService.createBook(book);
	    }
	    
	    @RequestMapping("/api/books/{id}")
	    public Book show(@PathVariable("id") Long id) {
	        Book book = bService.findBook(id);
	        return book;
	    }
}
