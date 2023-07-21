interface First {
	int sum (int x,int y);
	int square(int x);
}

interface Second {
	int power(int x,int n);
}

class Abc implements First,Second {
	public int sum (int x,int y) {
		return x+y;
	}
	public int square(int x) { return x*x; }
	
	public int power(int x,int n) {
		int res = 1;
		for (;n>0;n--)
			res = res *x;
		return res;
	}
}

class Test {
	public static void main (String[] args) {
		Abc a = new Abc();
		System.out.println("Sum of numbers is :- "+a.sum(10,20));
		System.out.println("Square of numbers is :- "+a.square(10));
		System.out.println("Power of numbers is :- "+a.power(2,3));
		
	}
}