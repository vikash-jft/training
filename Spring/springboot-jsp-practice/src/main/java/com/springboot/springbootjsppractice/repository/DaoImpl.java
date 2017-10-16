package com.springboot.springbootjsppractice.repository;

import com.springboot.springbootjsppractice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by vikash on 15/10/17.
 */
@Repository
public class DaoImpl implements Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private class Login implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User u = new User();
            u.setId(resultSet.getInt("id"));
            u.setName(resultSet.getString("name"));
            u.setPassword(resultSet.getString("password"));
            u.setAge(resultSet.getInt("age"));
           // u.setDob(resultSet.getDate("dob"));
            u.setEmail(resultSet.getString("email"));
            // u.setSkill(Arrays.asList(resultSet.getString("skill")));
            return u;
        }
    }

    @Override
    public Collection<User> isValidUser(String name, String password) {
        final String sql = "select * from user where name=? and password=?";
        List<User> st = jdbcTemplate.query(sql, new Login(), name, password);
        return st;
    }

    @Override
    public void addUser(User user) {
        String sql = "insert into user (name,password,age,email) values(?,?,?,?)";
        System.out.println(user.toString());
        jdbcTemplate.update(sql, new Object[]{user.getName(), user.getPassword(), user.getAge(), user.getEmail()});
    }

    @Override
    public Collection<User> UserList(User user) {
        String sql = "SELECT * from login";
        System.out.println(user.toString());
        List<User> list = jdbcTemplate.query(sql, new Login(), user.getName(), user.getPassword(), user.getAge(),user.getEmail());
        return list;
    }

    @Override
    public void forgotPass(User u) {
        System.out.printf("User : "+u.getEmail()+" , Password :"+u.getPassword());
        String sql="update user set password=? where email=?";
        jdbcTemplate.update(sql,u.getPassword(),u.getEmail());
    }
}