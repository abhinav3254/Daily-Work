package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main7 {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pst = null;
		PreparedStatement pst2 = null;
		String url = "jdbc:mysql://localhost:3306/abhinav";
		
		try {
			connection = DriverManager.getConnection(url,"root","3254");
			connection.setAutoCommit(false);
			pst = connection.prepareStatement("DELETE FROM EMPLOYEE");
			int count = pst.executeUpdate();
			connection.commit();
			
			System.out.println(count+" rows deleted");
			pst2 = connection.prepareStatement("insert into department values(?,?,?)");
			pst2.setInt(1, 50);
			pst2.setString(2, "Finance");
			pst2.setString(3, "Mumbai");
			
			count = pst2.executeUpdate();
			System.out.println(count+" rows inserted");
			connection.rollback();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
