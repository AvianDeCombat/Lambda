package com.learn.java.bean;

public class Student {
    private String name;
    private Float gpa;
    private Integer gradeLevel;
    private String gender;
    private Integer Age;

    public Student(String name, Float gpa, Integer gradeLevel, String gender, Integer age) {
        this.name = name;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", gradeLevel=" + gradeLevel +
                ", gender='" + gender + '\'' +
                ", Age='" + Age + '\'' +
                '}';
    }
}
