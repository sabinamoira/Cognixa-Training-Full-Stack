package com.ibm.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ibm.jpa.domain.Books;

public interface BookRepository extends CrudRepository<Books, Long> {
	
	@Query(value = "select * from books where name = ?",
			nativeQuery = true)
	List<Books> findByName(String name);
	
}
