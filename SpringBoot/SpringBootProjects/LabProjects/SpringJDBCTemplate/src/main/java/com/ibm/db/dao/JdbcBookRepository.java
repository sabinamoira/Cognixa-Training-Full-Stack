package com.ibm.db.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.db.domain.Book;

@Repository
public class JdbcBookRepository implements BookRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from books",
				(rs, rowNum) -> new Book(rs.getLong("id"), rs.getString("name"), rs.getBigDecimal("price")));
	}

	@Override
	public int save(Book book) {
		return jdbcTemplate.update("insert into books (name, price) values (?,?)",
				book.getName(), book.getPrice());
	}


	@Override
	public void delete(int id){
		jdbcTemplate.update("delete from books where id = ?", id);
	}

	@Override
	public Book findById(Long id) {
		return jdbcTemplate.queryForObject(
				"select * from books where id = ?",
				(rs, rowNum )->
				new Book(rs.getLong("id"), rs.getString("name"), rs.getBigDecimal("price")), 
				id
				);
	}
}
