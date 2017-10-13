package com.SpringBoot.springbootmysqlcurd.dao;

import com.SpringBoot.springbootmysqlcurd.entity.Emp;
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

    public void save(Emp emp){
        final String sql="insert into emp values(?,?,?,?)";
        int s=jdbcTemplate.update(sql,emp.getId(),emp.getFname(),emp.getLname(),emp.getSal());
        if(s==1){
            System.out.println("**********Sucessfully Submitted********");
        }
        else {
            System.out.println("Not Sucessfully");
        }
    }

    public void update(Emp emp){
        final String sql="update emp set fname=?, lname=?, sal=? where id=?";
        int u=jdbcTemplate.update(sql,emp.getFname(),emp.getLname(),emp.getSal(),emp.getId());
        if(u==1){
            System.out.println("SucessFully Updated");
        }
        else {
            System.out.println("Not Sucessfully");
        }
    }

    public void delete(int id){
        final String sql="delete from emp where id=? ";
        int d=jdbcTemplate.update(sql,id);
        if(d==1){
            System.out.println("SucessFully Deleted");
        }
        else {
            System.out.println("Not Sucessfully");
        }
    }

}
