package com.studentCourseDetails.dao;

import com.studentCourseDetails.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by vikash on 10/10/17.
 */
@Repository
@Qualifier("MongoDatabase")
public class MongoDaoImpl implements StudentDao {


    @Override
    public Collection getAllStudent() {
        return new ArrayList<Student>(){
            {
                add(new Student(101,"Vikash","SpringBoot"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }
}
