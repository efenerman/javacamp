package com.efe;

public class CourseManager {
    public void add(Course course) {

        System.out.println(course.getCourseId()+" id li "+" ve "+course.getCourseName() + "  isimli kurs  eklendi.");
    }

    public void addMultiple(Course[] courses) {

        for (Course course : courses) {

            System.out.println(course.getCourseId()+" id li "+" ve "+course.getCourseName() + "  isimli kurs  eklendi.");
        }
    }

    public void remove(Course course) {

        System.out.println(course.getCourseId()+" id li "+" ve "+course.getCourseName() + "  isimli kurs  silindi.");
    }

}
