package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Main4 {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/abhinav";
		ResultSetMetaData rsmd = null;
		try {
			connection = DriverManager.getConnection(url,"root","3254");
//			pst = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE EMPID = ?");
			pst = connection.prepareStatement("SELECT * FROM EMPLOYEE");
//			pst.setInt(1, 102);
			rs = pst.executeQuery();
			rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			
			for (int i = 1;i<=rsmd.getColumnCount();i++) {
				System.out.print(rsmd.getColumnName(i)+"  ");
			}
			System.out.println();
//			if (rs.next()) {
//				System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
//			}
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Eroor :- "+e);
		}
	}
}
