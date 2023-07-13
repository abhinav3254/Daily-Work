package exception;

import java.sql.SQLException;

public class MainThree {
	public static void main(String[] args) {
		try {
			UtilityThree.divide(10, 1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}