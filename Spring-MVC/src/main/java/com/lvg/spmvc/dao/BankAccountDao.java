package com.lvg.spmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import org.springframework.stereotype.Repository;

@Repository
public class BankAccountDao {
	private static final String url = "jdbc:mysql://localhost:3306/spring";
	public boolean updateBalance(String username,double amount) {
		int count = 0;
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,"root","3254");
			pst = connection.prepareStatement("update bank_account set balance = balance - ? where username =?");
			pst.setDouble(1, amount);
			pst.setString(2, username);
			
			count = pst.executeUpdate();
			
		} catch(Exception e) {
			System.out.println(e);
		}
		return count == 1;
	}
}
