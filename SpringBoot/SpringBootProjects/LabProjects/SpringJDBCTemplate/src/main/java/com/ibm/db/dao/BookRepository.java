package com.ibm.db.dao;

import java.util.List;

import com.ibm.db.domain.Book;

public interface BookRepository {
	
	List<Book> findAll();
	
	int save(Book book);

	void delete(int id);
	
	Book findById(Long id);
	

}
