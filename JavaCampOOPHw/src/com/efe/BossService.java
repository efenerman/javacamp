package com.efe;

public class BossService {
    public  void fireEmployee(Employee employee,Boss boss){
        System.out.println("The boss "+boss.name+" "+" fired "+employee.emp_duty+" "+employee.emp_name +" ID is:"+employee.emp_id);
    }
    public  void hireEmployee(Employee employee,Boss boss){
        System.out.println("The boss "+boss.name+" "+" hired "+employee.emp_duty+" "+employee.emp_name+" ID is:"+employee.emp_id);
    }

}
