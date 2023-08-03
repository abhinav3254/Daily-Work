package com.lvg.spmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.lvg.spmvc.beans.User;

@Repository
public class UserDAO {
	private static String url = "jdbc:mysql://localhost:3306/spring";
	public boolean searchUser(User user) {
		int count = 0;
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,"root","3254");
			pst = connection.prepareStatement("select count(*) from users where username = ? and password = ?");
			
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			ResultSet rs = pst.executeQuery();
			
			if (rs.next()) count =  rs.getInt(1);
		} catch(Exception e) {
			System.out.println(e);
		}
		return count == 1;
	}
}
