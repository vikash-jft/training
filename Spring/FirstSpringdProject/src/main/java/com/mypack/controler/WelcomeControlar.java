package com.mypack.controler;

//import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mypack.service.*;

/**
 * Created by vikash on 5/10/17.
 */
//@Component
    // RestController works ByDefault on The Current package but We make any file out of the package
    // then we need to include @ComponentScan.
@RestController
@ComponentScan("com.mypack")
public class WelcomeControlar {
    @Autowired
    WelcomeMsg wm;

    @RequestMapping("/welcome")
    public String message(){
        return wm.returnMsg();
    }
}
