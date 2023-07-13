package exception;

public class UtilityThree {
	public static int divide (int x,int y) throws java.sql.SQLException {
		if (y!=0) {
			System.out.println(x/y);
		} else {
//		try {
//		throw new java.sql.SQLException();
//		}
//		catch (java.sql.SQLException e) {
//			System.out.println("Invalid Exception");
//			// TODO: handle exception
//		}
			throw new java.sql.SQLException();
	}
		return 0;
	}
}
