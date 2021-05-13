package com.springexample;
 
import javax.inject.Inject;
 
public class StuHolder {
     
    /* Inject annotation wires the property byType by default */
    @Inject
    Stu student;
     
    public Stu getStudent() {
        return student;
    }
 
    public void setStudent(Stu student) {
        this.student = student;
    }   
     
    public void displayStudentDetails(){
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Student No: "+student.getStudentNo());
        System.out.println("Student Name: "+student.getStudentName());
    }
}