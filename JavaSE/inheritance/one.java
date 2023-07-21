class A {
	int x = 10;
	public A () {
		System.out.println("A created");
	}
}

class B extends A {
	int y = 20;
	public B () {
		System.out.println("B Created");
	}
}

class C extends B {
	int z = 30;
	public C () {
		System.out.println("C Created");
	}
}

class Test {
	public static void main (String[] args) {
		C c1 = new C();
		System.out.println(c1.x+" "+c1.y+" "+c1.z);
	}
}