package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main2 {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/abhinav";
		try {
			connection = DriverManager.getConnection(url,"root","3254");
			pst = connection.prepareStatement("SELECT * FROM EMPLOYEE");
			rs = pst.executeQuery();
			while (rs.next())
				System.out.println(" "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				if (rs!=null) rs.close();
				if (pst!=null) pst.close();
				if (connection!=null) connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
