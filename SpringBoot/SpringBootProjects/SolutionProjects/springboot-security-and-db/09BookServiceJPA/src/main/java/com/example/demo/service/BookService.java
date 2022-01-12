package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Books;
import com.example.demo.repo.BookRepository;

@Component
public class BookService {
	@Autowired
	BookRepository repository;

	public void add(Books dto) {
		repository.save(dto);
	}

	public void delete(long id) {
		repository.deleteById(id);
	}

	public List<Books> getBooks() {
		return (List<Books>) repository.findAll();
	}

	public Books getBookById(long id) {
		Optional<Books> optionalBook = repository.findById(id);
		return optionalBook.orElseThrow(() -> new BookNotFoundException("Couldn't find a Book with id: " + id));
	}

//	    private Dog toEntity(DogDto dto) {
//	        Dog entity = new Dog();
//	        entity.setName(dto.getName());
//	        entity.setAge(dto.getAge());
//	        return entity;
//	    }
}
