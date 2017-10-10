package com.studentCourseDetails.controller;

import com.studentCourseDetails.entity.Student;
import com.studentCourseDetails.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by vikash on 10/10/17.
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Collection<Student> getAllStudent(){
        return service.getAllStudent();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public @ResponseBody Student getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public @ResponseBody void removeStudentById(@PathVariable("id") int id1){
        service.removeStudentById(id1);
    }
    /*@RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody void updateStudent(@RequestBody Student st){
        service.updateStudent(st);
    }*/
}
