package com.springboot.springbootjsppractice.controller;

import com.springboot.springbootjsppractice.entity.User;
import com.springboot.springbootjsppractice.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

/**
 * Created by vikash on 14/10/17.
 */
@Controller
public class UserController {

    @Autowired
    private UserServices loginServices;

    @GetMapping("/login")
    public String loginUser(){
        System.out.println("********* get method Login page  **************");
        return "login";
    }
    @PostMapping("/welcome")
    public String welcomeUser(@RequestParam String user, @RequestParam String pass, Model model){
        Collection<User> c=loginServices.isValidUser(user,pass);
        for(User u:c) {
            if(u.getId()>0) {
                model.addAttribute("user", user);
                return "welcome";
            }
        }
        model.addAttribute("error","Either userName or password is Correct!!!");
        return "login";
    }

    @GetMapping("/addUser")
    public String addUser(){
        System.out.println("**********AddUser*************");
        return "addUser";
    }
    @GetMapping("/EditUser")
    public String UserList(@ModelAttribute User u,Model model) {
        model.addAttribute("u",u);
        return "addUser";
    }

    @PostMapping("/addUser/submitForm")
    public String addUserWelcome(Model m, @ModelAttribute("user") User user){
        loginServices.addUser(user);
        m.addAttribute("msg","Sucessfully Inserted!!!");
        return "logout";
    }

    @GetMapping("/forgotPassword")
    public String forgotPassword(){
        return "forgotPassword";
    }

    @PostMapping("/forgotPassword/submitform")
    public String submitformOfForgotPass(Model model,@ModelAttribute("user") User u,@RequestParam String password1){
        if(u.getPassword().equalsIgnoreCase(password1)) {
            model.addAttribute("msg", "Remember Password for Future Uses");
            loginServices.forgotPass(u);
            return "logout";
        }
        model.addAttribute("error", "You have successfully created New Password!!!");
        return "forgotPassword";
    }

    @GetMapping("/logout")
    public String logout(Model model)
    {
        model.addAttribute("msg","You have Sucessfully Logout");
        return "logout";
    }

}
