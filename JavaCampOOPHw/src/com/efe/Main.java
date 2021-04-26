package com.efe;

public class Main {

    public static void main(String[] args) {
	Employee employee1=new Employee(5,"George","Mechanic");
        Employee employee2=new Employee(3,"Maya","Engineer");
        Employee employee3=new Employee(8,"Hank","Cleaner");
        Employee employee4=new Employee(4,"Leo","Doctor");

        Employee employees[]={employee1,employee2,employee3,employee4};

        for (Employee employee:employees){
            System.out.println(employee1.toString());
        }
        System.out.println(employees.length);

        Boss boss=new Boss("Henry");
        BossService service=new BossService();
        service.fireEmployee(employee1,boss);
        service.hireEmployee(employee3,boss);
        service.fireEmployee(employee2,boss);
        service.hireEmployee(employee4,boss);
    }
}
