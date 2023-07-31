package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/abhinav";
		Connection connection = DriverManager.getConnection(url,"root","3254");
		PreparedStatement pst = connection.prepareStatement("SELECT * FROM EMPLOYEE");
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			System.out.println(" "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
}
