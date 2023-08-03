package com.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.MakeConnection;

public class EmployeeDao {
	static Connection connection  = null;
	public static int registerUser(Employee employee) {
		connection = MakeConnection.makeConnection();
		String query = "INSERT INTO employee (name, address, age, salary, role)\n"
				+ "VALUES(?,?,?,?,?);";
		ResultSet resultSet = null;
		int count = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setString(2, employee.getAddress());
			preparedStatement.setInt(3, employee.getAge());
			preparedStatement.setString(4, employee.getSalary());
			preparedStatement.setString(5, employee.getRole());
			
			count = preparedStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	public static List<Employee> getAllUsers() {
		String query = "select * from employee";
		List<Employee> listEmployees = new ArrayList<Employee>();
		try {
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			listEmployees.add(new Employee(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getString(5),resultSet.getString(6)));
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return listEmployees;
	}
}
