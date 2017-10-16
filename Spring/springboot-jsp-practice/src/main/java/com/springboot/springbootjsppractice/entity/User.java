package com.springboot.springbootjsppractice.entity;

import javax.persistence.Table;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

/**
 * Created by vikash on 15/10/17.
 */
public class User {
    private int id,age;
    private String name,password,email;
    //private Date dob;
    //private List<String> skill;

    public User() {
    }
    public User(String name, String password, int age, String email) {
        this.name = name;
        this.password = password;
        //this.dob = dob;
        this.email=email;
        //this.skill=skill;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    /*public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        //DateFormat dt =new SimpleDateFormat("yyyy-MM-dd");
        this.dob=dob;
    }*/
    /*public List<String> getSkill() {
        return skill;
    }
    public void setSkill(List<String> skill) {
        this.skill = skill;
    }*/
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
