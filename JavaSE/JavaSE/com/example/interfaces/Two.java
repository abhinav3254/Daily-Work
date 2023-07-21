interface Calculator {
	int sum (int x, int y);
	int square(int x);
	//int power(int x,int n);
}

class AbcCalculator implements Calculator {
	public int sum (int x,int y) {
		return x+y;
	}
	public int square (int x) {
		return x*x;
	}
}

class XyzCalculator implements Calculator {
	public int sum (int x,int y) {
		return x - (-y);
	}
	public int square(int x) {
		int res = 1;
		for (int i = 1;i<=2;i++)
			res = res*x;
		return res;
	}
}

class Two {
	public static void main(String[] args) {
		Calculator c = new AbcCalculator();
		Calculator c1 = new XyzCalculator();
		System.out.println(c.sum(10,20));
		System.out.println(c.square(2));
		System.out.println(c1.sum(10,20));
		System.out.println(c1.square(2));
		
	}
}