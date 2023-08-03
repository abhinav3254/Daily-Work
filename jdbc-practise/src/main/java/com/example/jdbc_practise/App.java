package com.example.jdbc_practise;

import java.sql.Connection;
import java.util.List;

import com.connection.MakeConnection;
import com.employee.Employee;
import com.employee.EmployeeDao;

public class App {
    public static void main( String[] args ) {
        Connection connection = MakeConnection.makeConnection();
        EmployeeDao employeeDao = new EmployeeDao();
        Employee employee = new Employee("Richard Rodriguez","555 Oakwood Dr, Town, State, ZIP",30,"52000","Specialist");
        System.out.println(employeeDao.registerUser(employee));
        List<Employee>listEmployees = EmployeeDao.getAllUsers();
        for (int i = 0;i<listEmployees.size();i++) {
        	System.out.println(listEmployees.get(i).toString());
        }
    }
}
