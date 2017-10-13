package com.SpringBoot.springbootmysqlcurd.services;

import com.SpringBoot.springbootmysqlcurd.dao.MysqlDao;
import com.SpringBoot.springbootmysqlcurd.entity.Emp;
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
    public void save(Emp emp){
        dao.save(emp);
    }
    public void update(Emp emp){
        dao.update(emp);
    }
    public void delete(int id){
        dao.delete(id);
    }
}
