package com.demo.rest.dao;

import org.springframework.stereotype.Repository;

import com.demo.rest.model.Employee;
import com.demo.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Lokkiesh", "Gupta", "hofjva@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alejx", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Davidfd", "Kameron", "titanic@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
