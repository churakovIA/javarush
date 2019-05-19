package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //------------------------------------------------------------------------------

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        return students.stream().filter(student -> student.getAverageGrade() == averageGrade).findFirst().get();
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        return students.stream().max((f,s)->Double.compare(f.getAverageGrade(), s.getAverageGrade())).get();
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        return students.stream().min((f,s)->Double.compare(f.getAverageGrade(), s.getAverageGrade())).get();
    }

    public void expel(Student student){
        students.remove(student);
    }

    //------------------------------------------------------------------------------

    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}