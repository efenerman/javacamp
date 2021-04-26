package com.efe;

public class Employee {
    int emp_id;
    String emp_name;
    String emp_duty;

    public Employee(int emp_id, String emp_name, String emp_duty) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_duty = emp_duty;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_duty='" + emp_duty + '\'' +
                '}';
    }
}
