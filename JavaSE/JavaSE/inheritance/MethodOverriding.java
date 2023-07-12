class A {
	
	public void message () {
		System.out.println("From A");
	}
	
	public int sum (int x,int y) {
		return x + y;
	}
}

class B extends A {
	
	public void message () {
		System.out.println("From B");
	}
	
	public int sum (int x,int y) {
		return x + y;
	}
}

class Test1 {
	public static void main(String[] args) {
		
		B b = new B();
		A a = new A();
		
		b.message();
		a.message();
		System.out.println("b sum = "+b.sum(10,20));
		System.out.println("a sum = "+a.sum(50,60));

	}
}