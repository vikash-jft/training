package com.SpringBoot.springbootmysqlcurd.dao;

import com.SpringBoot.springbootmysqlcurd.entity.Emp;

import java.util.Collection;

/**
 * Created by vikash on 12/10/17.
 */
public interface MysqlDao {

    public Collection<Emp> findAll();

    public Collection<Emp> find(int id);
    public void save(Emp emp);
    public void update(Emp emp);
    public void delete(int id);


}
