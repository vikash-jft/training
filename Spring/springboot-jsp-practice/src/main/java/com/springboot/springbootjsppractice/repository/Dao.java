package com.springboot.springbootjsppractice.repository;

import com.springboot.springbootjsppractice.entity.User;

import java.util.Collection;
import java.util.List;

/**
 * Created by vikash on 15/10/17.
 */
public interface Dao {
    public Collection<User> isValidUser(String user, String pass);

    void addUser(User user);
    public Collection<User> UserList(User user);

    public void forgotPass(User u);
}
