package com.efe;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Henry");
        student.setLastName("Ford");
        student.setId("45678");
        student.setStudentNo(15);


        Instructor instructor = new Instructor();
        instructor.setFirstName("Angela");
        instructor.setLastName("YU");

        UserManager userManager = new UserManager();
        userManager.add(student);
        userManager.remove(instructor);

        Course java = new Course(1, "Java");
        Course flutter = new Course(2, "Flutter");
        Course php = new Course(3, "PHP");
        Course ruby = new Course(4, "Ruby");

        Course[] courses = {java,flutter,php,ruby};

        CourseManager courseManager = new CourseManager();
        courseManager.add(java);
        courseManager.remove(flutter);
        courseManager.addMultiple(courses);

        StudentManager studentManager = new StudentManager();
        studentManager.takeCourse(student, flutter);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.courseGiven(instructor, flutter);
    }
}
