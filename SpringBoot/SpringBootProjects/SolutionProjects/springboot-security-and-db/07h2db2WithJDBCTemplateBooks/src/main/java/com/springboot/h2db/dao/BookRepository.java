package com.springboot.h2db.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.springboot.h2db.domain.Book;

public interface BookRepository {

    int count();

    int save(Book book);

    int update(Book book);

    int deleteById(Long id);

    List<Book> findAll();

    List<Book> findByNameAndPrice(String name, BigDecimal price);

    Book findById(Long id);

    String getNameById(Long id);

}
