package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Books;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired BookService service;

    @GetMapping
    public List<Books> getBooks() {
    	System.out.println(service.getBooks());
        return service.getBooks();
    }

    @PostMapping
    public void postBooks(@RequestBody Books dto) {
        service.add(dto);
    }

    @GetMapping("/{id}")
    public Books getById(@PathVariable(required = true) long id) {
        return service.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {
        service.delete(id);
    }
}