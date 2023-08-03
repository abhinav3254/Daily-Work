package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MakeConnection {
	private static final String url = "jdbc:mysql://localhost:3306/jdbc";
	private static final String user = "root";
	private static final String password = "root3254";
	public static Connection connection = null;
	
	public static Connection makeConnection() {
		 try {
			 connection = DriverManager.getConnection(url,user,password);
			if (connection.isClosed()) {
				 System.out.println("connection closed");
			 } else {
				 System.out.println("connection open");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return connection;
	}
}
