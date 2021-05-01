package com.efe;

public class InstructorManager extends UserManager{
    public  void instructorInformation(Instructor instructor){
        System.out.println("Instructor name:"+instructor.getFirstName()+" "+instructor.getLastName()+" "+" Work exp:"+instructor.getWorkExperience()+" "+" CoursesNo:"+instructor.getNoofCourses());

    }
    public void courseGiven(Instructor instructor , Course course) {

        System.out.println(instructor.getFirstName() +" "+instructor.getLastName() +" isimli eğitmen " + course.getCourseName() + " kursu veriyor.");

    }
    public void courseRemove(Instructor instructor , Course course) {

        System.out.println(instructor.getFirstName() +" "+instructor.getLastName() +" isimli eğitmen " + course.getCourseName() + " kursunu sildi.");

    }
}
