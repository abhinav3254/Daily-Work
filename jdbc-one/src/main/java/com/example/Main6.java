package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Main6 {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/abhinav";
//		ResultSetMetaData rsmd = null;
		try {
			connection = DriverManager.getConnection(url, "root", "3254");
			pst = connection.prepareStatement("DELETE FROM EMPLOYEE");
			pst.executeUpdate();
//			System.out.println();
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getInt(4));
//			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Eroor :- " + e);
		}
	}
}
