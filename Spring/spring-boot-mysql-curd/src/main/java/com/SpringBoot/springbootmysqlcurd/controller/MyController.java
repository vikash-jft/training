package com.SpringBoot.springbootmysqlcurd.controller;

import com.SpringBoot.springbootmysqlcurd.entity.Emp;
import com.SpringBoot.springbootmysqlcurd.services.EmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by vikash on 12/10/17.
 */
@Controller
public class MyController {

    @Autowired
    private EmpServices services;
    private static int userid=0;

    @RequestMapping("/findAll")
    public String  findAll(ModelMap modelMap){
        modelMap.addAttribute("alluserinfo",services.findAll());
        System.out.println("--------------------- find All Users ---------------");
        return "allUserInfo";
    }
    @GetMapping(value = "/find/{id}")
    public String find(@PathVariable int id,Model model){
       model.addAttribute("obj",new Emp());
       model.addAttribute("find",services.find(id));
       model.addAttribute("userId",id);
       userid=id;
        System.out.println("===============Find Specific User====================");
        return "oneUserInfo";
    }
    /*@RequestMapping(value = "/find/{id}",method = RequestMethod.POST)
    // @ResponseBody
    public String edit(@PathVariable int id,Model model){
        //System.out.println("**********************\n"+services.find(id));
        model.addAttribute("emp",services.find(id));
        return "oneUserInfo";
    }*/

    @GetMapping("/createUser")
    //@ResponseBody
    public String gettingForm(Model model){
        model.addAttribute("obj",new Emp());
       // Emp emp=new Emp(6,"RamJas","Singh",85000);
        //services.save(emp);
       //return "Sucessfully Submitted";
        System.out.println("===============Before Submiting Form================");
        return "createUser";
    }

    @PostMapping("/createUser")
    public String submittedForm(@ModelAttribute Emp emp,Model model){
        services.save(emp);
        model.addAttribute("msg","You have Sucessfully Submited");
        System.out.println("===============After Submiting Form================");
        return "welcome";
    }


    @PostMapping("/update")
    //@ResponseBody
    public String beforeupdate(@ModelAttribute Emp emp,Model model){
        System.out.println("come to the update");
        //Emp emp=new Emp(6,"Suraj","****",80000);
                emp.setId(userid);
        System.out.println(emp.getId());
        System.out.println(emp.getFname());

        services.update(emp);
        model.addAttribute("msg","You have Sucessfully Updated");

        System.out.println("===============Before Updating Form================");
        return "welcome";
    }

    /*@PostMapping("/update")
    @ResponseBody
    public String afterupdate(){
        Emp emp=new Emp(6,"Suraj","****",80000);
        services.update(emp);
        return "Updated Sucessfully";
    }*/

    @RequestMapping("/delete/{id}")
    //@ResponseBody
    public String delete(@PathVariable ("id") int userid, Model model){
                services.delete(userid);
                model.addAttribute("msg","Sucessfully Deleted");
        System.out.println("===============Deleteting Form================");
        return "welcome";
    }
}
