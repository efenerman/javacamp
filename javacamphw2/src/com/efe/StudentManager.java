package com.efe;

public class StudentManager extends UserManager {
    public void takeCourse(Student student,Course course){
        System.out.println(student.getFirstName() + " " + student.getLastName()+" isimli öğrenci "+course.getCourseName()+" kursunu aldı.");
    }
    public void dropCourse(Student student,Course course){
        System.out.println(student.getFirstName() + " " + student.getLastName()+" isimli öğrenci "+course.getCourseName()+" kursunu bıraktı.");
    }
}
