package com.studentCourseDetails.services;

import com.studentCourseDetails.dao.FakeStudentDaoImpl;
import com.studentCourseDetails.dao.StudentDao;
import com.studentCourseDetails.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.Collection;

/**
 * Created by vikash on 10/10/17.
 */
@Controller
public class StudentService {
    @Autowired
    @Qualifier("MongoDatabase")
    private StudentDao studentDao;

    public Collection<Student> getAllStudent(){
        return studentDao.getAllStudent();
    }

    public Student getStudentById(int id){
        return studentDao.getStudentById(id);
    }
    public void removeStudentById(int id){
        studentDao.removeStudentById(id);
    }
    /*public void updateStudent(Student st){
        studentDao.updateStudent(st);
    }*/
}
