package exception;


public class Utility {
	public static int divide (int x,int y) {
		// re throwing the exception after catching
		int ans = 0;
		try {
			ans = x/y;
		} catch (Exception e) {
			System.out.println("Utility Catch");
			throw e;
		}
		return ans;
	}
	
	public static int divide2(int x,int y) {
		if (y!=0) 
			return x/y;
		throw new ArithmeticException("can't divide a number by zero");
	}
}