package com.springboot.h2db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.springboot.h2db.domain.*;

@Repository
public class UserRepository
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findAll() {
        return jdbcTemplate.query("select * from users", 
                new UserRowMapper());
    }
    public User findUserById(int id) {
        return jdbcTemplate.queryForObject(
            "select * from users where id=?", new UserRowMapper(),id);
    } 
     class UserRowMapper implements RowMapper<User>
     {
     	@Override
     	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
     		// TODO Auto-generated method stub
     		 User user = new User();
     	        user.setId(rs.getInt("id"));
     	        user.setName(rs.getString("name"));
     	        user.setEmail(rs.getString("email"));
     	        return user;
     	}
     }
      
     
     
     
//     public User create(final User user) 
//     {
//         final String sql = "insert into users(name,email) values(?,?)";
//
//         KeyHolder holder = new GeneratedKeyHolder();
//         jdbcTemplate.update(new PreparedStatementCreator() {
//             @Override
//             public PreparedStatement createPreparedStatement(Connection connection) 
//            		 
//            		 throws SQLException {
//                 PreparedStatement ps = 
//                connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//                 ps.setString(1, user.getName());
//                 ps.setString(2, user.getEmail());
//                 return ps;
//             }
//         }, holder);
//
//         int newUserId = holder.getKey().intValue();
//         user.setId(newUserId);
//         return user;
//     }
     
     public User create(final User user) 
     {
         final String sql = "insert into users(name,email) values(?,?)";
         jdbcTemplate.update(sql, user.getName(), user.getEmail());
         return user;
     }
 }



 
 
 
 
 
 
 
 
 