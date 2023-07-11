package polydemo;

public class Test {
	public static void main(String[] args) {
		A a = new B();
		// a.methodA();
		// System.out.println(a.x);
		
		A a1 = new C();
		// a1.methodA();
		// System.out.println(a1.x);
		
		a.show();
		a1.show();
	}
}
