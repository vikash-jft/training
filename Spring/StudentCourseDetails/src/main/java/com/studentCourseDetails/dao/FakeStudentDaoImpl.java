package com.studentCourseDetails.dao;

import com.studentCourseDetails.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by vikash on 10/10/17.
 */
@Repository
@Qualifier("FakeDatabase")
public class FakeStudentDaoImpl implements StudentDao {
    private static Map<Integer,Student> students;

    static{
        students=new HashMap<Integer,Student>(){
            {
                put(1, new Student(1, "Suresh", "Java"));
                put(2, new Student(2, "Binodh", "Spring"));
                put(3, new Student(3, "Kamlesh", "JavaScript"));
                put(4, new Student(4,"Rajesh", ".net"));
                put(5, new Student(5, "Ashu", "Php"));
            }
        };
    }
    @Override
    public Collection getAllStudent(){
        return students.values();
    }

    ////Get Single Object from Map Multiple Object

    /*public Student getStudentById(int id){
        for(Student st: students.values()){
            if(st.getId()==id){
                System.out.println(st.getId()+" "+st.getName()+" "+st.getCourse());
                return st;
            }
        }
    return null;
    }*/

    @Override
    public Student getStudentById(int id){
        return students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        students.remove(id);
    }

    /*public void updateStudent(Student st){
        Student s=students.get(st.getId());
        s.setName(st.getName());
        s.setCourse(st.getCourse());
        students.put(st.getId(),st);
    }*/
}
