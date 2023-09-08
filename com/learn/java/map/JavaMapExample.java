package com.learn.java.map;

import com.learn.java.DAO.PopulateStudent;
import com.learn.java.bean.Student;

import java.util.List;
import java.util.stream.Collectors;

public class JavaMapExample {
    public static void main(String[] args) {
        PopulateStudent p = new PopulateStudent();
        List<Student> stu = p.getAllStudents();
        System.out.println(stu.stream()
                        //.filter(student -> !student.getGender().equals("Female"))
                //.map(student -> student.getName()+" "+ student.getGender())
                        //.findAny().get());
                .collect(Collectors.groupingBy(studetn->studetn.getGender())));
    }
}
