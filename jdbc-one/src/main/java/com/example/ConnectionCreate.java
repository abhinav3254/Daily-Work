package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreate {
	static Connection connection;
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user = "root";
        String password = "3254";
        String url = "jdbc:mysql://localhost:3306/abhinav";
        connection = DriverManager.getConnection(url, user, password);
        
        return connection;
	}
}
