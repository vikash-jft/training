package com.SpringBoot.springbootmysql.controller;

import com.SpringBoot.springbootmysql.entity.Emp;
import com.SpringBoot.springbootmysql.services.EmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by vikash on 12/10/17.
 */
@Controller
public class MyController {

    @Autowired
    private EmpServices services;

    @RequestMapping("/findAll")
    @ResponseBody
    public Collection<Emp> findAll(){
        System.out.println("**********************\n"+services.findAll());
        return services.findAll();
    }
    @RequestMapping("/find/{id}")
    @ResponseBody
    public Collection<Emp> find(@PathVariable int id){
        System.out.println("**********************\n"+services.find(id));
        return services.find(id);
    }

}
