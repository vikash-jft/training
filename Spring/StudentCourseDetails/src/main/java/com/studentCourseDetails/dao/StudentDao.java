package com.studentCourseDetails.dao;

import com.studentCourseDetails.entity.Student;

import java.util.Collection;

/**
 * Created by vikash on 10/10/17.
 */
public interface StudentDao {
    Collection getAllStudent();

    Student getStudentById(int id);

    void removeStudentById(int id);
}
