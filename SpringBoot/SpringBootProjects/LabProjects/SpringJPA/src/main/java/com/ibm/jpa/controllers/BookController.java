package com.ibm.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.jpa.domain.Books;
import com.ibm.jpa.service.BookService;




@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping(value = "/books")
	public List<Books> getAllBooks() {
		return this.bookService.getBooks();

	}
	
	@PostMapping(value = "/books")
	public void saveBook(@RequestBody Books book) {
		this.bookService.add(book); 
		//return this.bookService.getBooks();

	}
	
	@GetMapping(value = "/books/{id}")
	public Books getById(@PathVariable("id") Long id) {//does same thing: public Books getById(@PathVariable Long id)
		return this.bookService.getBookById(id);
	}
	
	@DeleteMapping(value = "/books/{id}")
	public void deleteBook(@PathVariable Long id) {
		 this.bookService.delete(id);
	}
	
	@GetMapping(value = "/books/byname/{name}")
	public List<Books> getById(@PathVariable String name) {
		return this.bookService.getBookByName(name);
	}
	

}
