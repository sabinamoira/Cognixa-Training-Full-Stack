package com.springboot.h2db.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.h2db.dao.BookRepository;
import com.springboot.h2db.domain.Book;

@RestController
public class BookController {
	
	@Autowired
	@Qualifier("jdbcBookRepository")
	private BookRepository repo;

	
	
	@RequestMapping("/books")
	public List<Book> getAllBooks(){
		return repo.findAll();
	}
	
	@RequestMapping("/books/{bookId}")
	public Book getUserById(@PathVariable Long bookId){
		
		Book book = repo.findById(bookId);
		return book;
	}


	@RequestMapping(value="/books", method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public int createUser(@RequestBody Book book){
		return repo.save(book);
	}
}



