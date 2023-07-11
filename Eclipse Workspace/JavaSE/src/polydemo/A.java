package polydemo;

public class A {
	int x = 10;
	
	public void methodA () {
		System.out.println("From A");
	}
	
	public void show () {
		System.out.println("From A");
	}
	
}

class B extends A {
	int y = 20;
	
	public void methodB () {
		System.out.println("From B");
	}
	public void show () {
		System.out.println("From B");
	}
}

class C extends A {
	int z = 30;
	
	public void methodC () {
		System.out.println("From C");
	}
	public void show () {
		System.out.println("From C");
	}
}
