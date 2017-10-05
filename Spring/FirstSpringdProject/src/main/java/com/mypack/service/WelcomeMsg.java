
package com.mypack.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMsg{

    public String returnMsg(){
        return "Wecome To The Spring Boot !!!";
    }
}
