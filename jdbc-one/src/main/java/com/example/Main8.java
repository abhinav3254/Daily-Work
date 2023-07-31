package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main8 {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/abhinav";
		
		try {
			connection = DriverManager.getConnection(url,"root","3254");
//			pst = connection.prepareStatement("select deptno,deptname,location from department",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pst = connection.prepareStatement("select deptno,deptname,location from department",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = pst.executeQuery();
			rs.absolute(3);
			rs.deleteRow();
//			while (rs.next())
//				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//			System.out.println("-----------------------");
//			while (rs.previous())
//				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			
//			rs.moveToInsertRow();
//			rs.updateInt(1, 60);
//			rs.updateString(2, "Finance");
//			rs.updateString(3, "Darbhanga");
//			rs.insertRow();
			
//			if (rs.rowInserted())
//				System.out.println("1 Row Inserted");
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
