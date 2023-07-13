package exception;

public class UtilityTwo {
	public static void a () {
		throw new ArithmeticException();
	}
	public static void b() {
		a();
	}
	public static void c() {
		b();
	}
	public static void d() {
		c();
	}
	
	public static int divide (int x,int y) throws ArithmeticException {
		if (y!=0)
			return x/y;
		throw new ArithmeticException();
	}
}
