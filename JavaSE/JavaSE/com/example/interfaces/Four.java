interface A {
int sum (int x,int y);
}
interface B extends A {
	int square(int x);
}

interface C extends B {
	int power(int x,int n);
}

class Abc implements C {
	public int sum (int x,int y) {
		return x+y;
	}
	
	public int square (int x) {
		return x*x;
	}
	
	public int power (int x,int n) {
		int res = 1;
		for (;n>0;n--) {
			res = res * x;
		}
		return res;
	}
	
}

class Test {
	public static void main(String[] args) {
		Abc a = new Abc();
		System.out.println("Sum is 1 :- "+a.sum(10,20));
		System.out.println("Square is 2 :- "+a.square(10));
		System.out.println("Power is 3 :- "+a.power(2,2));
		
	}
}