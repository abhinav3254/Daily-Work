package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Main5 {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/abhinav";
//		ResultSetMetaData rsmd = null;
		try {
			connection = DriverManager.getConnection(url, "root", "3254");
			pst = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?,?,?)");
			
			pst.setInt(1, 117);
			pst.setString(2, "mukesh");
			pst.setDouble(3, 4000.45);
			pst.setInt(4, 10);
			System.out.println(pst.executeUpdate());
			pst = connection.prepareStatement("SELECT * FROM EMPLOYEE");
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Eroor :- " + e);
		}
	}
}
