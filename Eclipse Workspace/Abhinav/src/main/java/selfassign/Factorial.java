package selfassign;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(findFac(6));
	}
	
	private static int findFac (int n) {
		if (n == 1)
			return 1;
		return n*findFac(n-1);
	}
}
