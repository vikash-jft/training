package com.springboot.springbootjsppractice.services;

import com.springboot.springbootjsppractice.entity.User;
import com.springboot.springbootjsppractice.repository.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.Collection;
import java.util.List;

/**
 * Created by vikash on 15/10/17.
 */
@Service
public class UserServices {

    @Autowired
    private Dao dao;

    public Collection<User> isValidUser(String user, String pass){
        return dao.isValidUser(user,pass);
    }

    public void addUser(User user) {
        dao.addUser(user);
    }
    public Collection<User> UserList(User user) {
        return dao.UserList(user);
    }
    public void forgotPass(User u){
        dao.forgotPass(u);
    }
}
