package com.SpringBoot.springbootmysql.dao;

import com.SpringBoot.springbootmysql.entity.Emp;

import java.util.Collection;

/**
 * Created by vikash on 12/10/17.
 */
public interface MysqlDao {

    public Collection<Emp> findAll();

    public Collection<Emp> find(int id);

}
