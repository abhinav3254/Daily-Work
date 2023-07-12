interface Utility {
	
	// PI is public static final
	double PI = 3.14;
	// square() is public abstract
	int square(int x);
	default public int sum (int x,int y) {
		System.out.println("from interface utility");
		return x+x;
	}
	
	public static int power (int x,int n) {
		int res = 1;
		for (;n>0;n--) 
			res = res + 1;
		return res;
	}
	
}

class AbcUtility implements Utility {
	public int square (int x) {
		System.out.println("from ABC utility");
		return x*x;
	}
}

class Test {
	public static void main(String[] args) {
		System.out.println(Utility.PI);
		System.out.println(Utility.power(5,3));
		AbcUtility a = new AbcUtility();
		System.out.println("Square method :- "+a.square(10));
		System.out.println("Sum:- "+a.sum(10,20));
		
	}
}