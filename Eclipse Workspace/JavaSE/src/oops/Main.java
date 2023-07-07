package oops;

// Inheritance

public class Main {
	
	public static void main(String[] args) {
		
		B b = new B(111,222);
		System.out.println("x = "+b.x);
		System.out.println("y = "+b.y);
		// System.out.println("XX value is :- "+b.xx);
		// not visible to B class
		b.methodA();
		b.methodB();
		
		b.setA(333);
		System.out.println("Value of XX is :- "+b.getA());
		
	}
}


class A {
	
	int x = 10;
	
	private int xx = 69;
	
	public void setA (int xx) {
		this.xx = xx;
	}
	
	public int getA ()  {
		return xx;
	}
	
	public A (int x) {
		this.x = x;
	}
	
	public void methodA () {
		System.out.println("A");
	}
	
}

class B extends A {
	
	public B (int x , int y) {
	//	super(); --> class the parent class default constructor
		super(x);
		//super.x = x; --> another way
		this.y = y;
		
	}
	
	int y = 20;
	
	public void methodB () {
		System.out.println("B");
	}
	
}