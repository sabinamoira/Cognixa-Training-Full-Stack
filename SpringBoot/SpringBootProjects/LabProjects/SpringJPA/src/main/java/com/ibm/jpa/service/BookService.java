package com.ibm.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.jpa.domain.Books;
import com.ibm.jpa.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
	public void add(Books book) {
		repository.save(book);
	}
	
	public List<Books> getBooks(){
		return (List<Books>) repository.findAll();
	}
	
	public Books getBookById(long id){
		 Optional<Books> optionalBook = repository.findById(id);
		 return optionalBook.orElseThrow(()-> new RuntimeException("Could mot find any books"));
	}
	
	public void delete(Long id){
		repository.deleteById(id);
	}
	
	public List<Books> getBookByName(String name){
		return repository.findByName(name);
	}
}
