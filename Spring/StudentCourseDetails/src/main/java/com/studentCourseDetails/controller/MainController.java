package com.studentCourseDetails.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vikash on 10/10/17.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String sayHi(){
        return "index";
    }
}
