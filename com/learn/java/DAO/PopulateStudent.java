package com.learn.java.DAO;

import com.learn.java.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class PopulateStudent {
    public List<Student> getAllStudents(){

        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("Emily", 5.6F, 5, "Female", 14 ));
        stuList.add(new Student("Hugo", 4.5F, 3, "male", 16 ));
        stuList.add(new Student("Luke", 5.0F, 2, "male", 12 ));
        stuList.add(new Student("Richard", 4.1F, 4, "male", 17 ));
        stuList.add(new Student("Ruth", 4.5F, 6, "Female", 18 ));
        stuList.add(new Student("Dina", 5.9F, 1, "Female", 7 ));

        return stuList;
    }
}
