package com.SpringBoot.springbootmysql.entity;

/**
 * Created by vikash on 12/10/17.
 */

public class Emp {
    private int id;
    private String fname,lname;
    private int sal;

    public Emp() {
    }

    public Emp(int id, String fname, String lname, int sal) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
