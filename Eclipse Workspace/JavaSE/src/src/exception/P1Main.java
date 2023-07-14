package exception;

public class P1Main {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		P1 p1 = null;
		try {
			p1 = new P1("John", 11);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		// System.out.println(p1);
	}
}
