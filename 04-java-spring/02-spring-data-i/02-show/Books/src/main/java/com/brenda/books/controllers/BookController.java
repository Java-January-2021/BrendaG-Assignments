package com.brenda.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brenda.books.models.Book;
import com.brenda.books.services.BookService;

@Controller
public class BookController {
	@Autowired
	 private  BookService bService;
	
    @RequestMapping("/books")
     public String index(Model model) {
        model.addAttribute("books", this.bService.allBooks());
        return "index.jsp";
    }
    
    @RequestMapping ("/books/{id}")
    public String findBook(@PathVariable("id") Long id, Model model) {
    Book book = bService.findBook(id);
    model.addAttribute("book", book);
    return "showBook.jsp";

    }
    
}