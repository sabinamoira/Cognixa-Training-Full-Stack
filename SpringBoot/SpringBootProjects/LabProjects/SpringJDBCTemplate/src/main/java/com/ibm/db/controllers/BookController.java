package com.ibm.db.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.db.dao.JdbcBookRepository;
import com.ibm.db.domain.Book;


@RestController
public class BookController {

	@Autowired
	private JdbcBookRepository jdbcRepo;

	@GetMapping(value = "/books", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Book> getAllBooks() {
		return this.jdbcRepo.findAll();

	}
	
	@PostMapping(value = "/books", consumes = { MediaType.APPLICATION_JSON_VALUE }, 
			produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public List<Book> saveBook(@RequestBody Book book) {
		this.jdbcRepo.save(book); 
		return this.jdbcRepo.findAll();

	}
	
	@DeleteMapping(
			value="/books/{id}",
			produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public List<Book> deleteBook(@PathVariable("id") int id){
		 this.jdbcRepo.delete(id);
		 return this.jdbcRepo.findAll();
	}
	
	
	@GetMapping(value = "/books/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Book getById(@PathVariable("id") Long id) {
		return this.jdbcRepo.findById(id);
	}
	/* BELOW CODE PRODUCES EXACT SAME RESULTS AS ABOVE
	 * 
	  @RequestMapping(value = "/books/{bookid}", produces = { MediaType.APPLICATION_JSON_VALUE })
			public Book getById(@PathVariable("bookId") Long id) {
			return this.jdbcRepo.findById(id);
	  }
	 */

}
