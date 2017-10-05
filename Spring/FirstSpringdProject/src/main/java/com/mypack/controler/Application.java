package com.mypack.controler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by vikash on 5/10/17.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext ap= SpringApplication.run(Application.class,args);
    }
}
