package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main3 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/abhinav";

		try (Connection connection = DriverManager.getConnection(url, "root", "3254");
				PreparedStatement pst = connection.prepareStatement("SELECT * FROM EMPLOYEE");
				ResultSet rs = pst.executeQuery()) {
			while (rs.next()) {
				System.out.println(
						" " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
