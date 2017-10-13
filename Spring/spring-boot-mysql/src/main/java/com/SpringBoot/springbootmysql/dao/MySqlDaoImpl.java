package com.SpringBoot.springbootmysql.dao;

import com.SpringBoot.springbootmysql.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * Created by vikash on 12/10/17.
 */
@Repository
public class MySqlDaoImpl implements MysqlDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class User implements RowMapper<Emp>{
        @Override
        public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
            Emp e = new Emp();
            e.setId(resultSet.getInt("id"));
            e.setFname(resultSet.getString("fname"));
            e.setLname(resultSet.getString("lname"));
            e.setSal(resultSet.getInt("sal"));
            return e;
        }
    }

    @Override
    public Collection<Emp> findAll() {
        final String sql = "select id,fname,lname,sal from emp";
        List<Emp> obj = jdbcTemplate.query(sql, new User());
        return obj;
    }

    @Override
    public Collection<Emp> find(int id) {
        final String sql="select id,fname,lname,sal from emp where id=?";
        List<Emp> obj= jdbcTemplate.query(sql,new User(),id);
        return obj;
    }
}
