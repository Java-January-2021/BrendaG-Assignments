package com.brenda.books.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "new.jsp";
    }
    @RequestMapping(value="/books", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        } else {
            bService.createBook(book);
            return "redirect:/books";
        }
    }
    @RequestMapping("/books/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bService.findBook(id);
        if (book != null){
            model.addAttribute("book", book);
            return "edit.jsp";
        }else{
            return "redirect:/books";
        }
    }
	@PostMapping("/books/edit/{id}")
	public String updateBook(@PathVariable("id") Long id, @Validated @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		else {
			this.bService.updateBook(id, book);
			return "redirect:/books";
		}
	}
	@RequestMapping("/books/delete/{id}")
	public String eraseBook(@PathVariable("id") Long id, @Validated @ModelAttribute("book") Book book, BindingResult result) {
		bService.deleteBook(id);
		return "redirect:/books";
	}
}