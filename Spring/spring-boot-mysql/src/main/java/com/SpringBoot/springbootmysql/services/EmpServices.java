package com.SpringBoot.springbootmysql.services;

import com.SpringBoot.springbootmysql.dao.MysqlDao;
import com.SpringBoot.springbootmysql.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by vikash on 12/10/17.
 */
@Service
public class EmpServices {

    @Autowired
    private MysqlDao dao;

    public Collection<Emp> findAll(){
        return dao.findAll();
    }

    public Collection<Emp> find(int id){
        return dao.find(id);
    }
}
