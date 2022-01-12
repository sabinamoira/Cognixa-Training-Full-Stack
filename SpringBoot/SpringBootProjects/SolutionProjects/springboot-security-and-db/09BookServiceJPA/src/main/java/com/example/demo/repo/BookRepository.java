package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Books;

import java.util.List;

public interface BookRepository extends CrudRepository<Books, Long> {

    List<Books> findByName(String name);

}
