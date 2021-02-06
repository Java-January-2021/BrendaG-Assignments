package com.brenda.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenda.books.models.Book;
import com.brenda.books.repositories.BookRepository;

@Service
public class BookService {

	  // adding the book repository as a dependency
		@Autowired
	   private  BookRepository bRepo;
	    

	    // returns all the books
	    public List<Book> allBooks() {
	        return this.bRepo.findAll();
	    }
	    // creates a book
	    public Book createBook(Book b) {
	        return this.bRepo.save(b);
	    }
	    
		public Book createBook(String title, String description, String author, int numberOfPages) {
			Book newBook = new Book(title, description, author, numberOfPages);
			System.out.println(newBook);
			return this.bRepo.save(newBook);
		}
	    // retrieves a book
	    public Book findBook(Long id) {
	        Optional<Book> optionalBook = this.bRepo.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }
}
