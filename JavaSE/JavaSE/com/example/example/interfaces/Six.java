interface Utility {
	
	public static int power (int x,int n) {
		int res = 1;
		for (;n>0;n--) {
			res = res * x;
		}
		return res;
	}
	public static int sum(int x,int y) {
		return x+y;
	}
	default public int square (int x) {
		System.out.println("from interface utility");
		return x*x;
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
		
		AbcUtility a = new AbcUtility();
		//Utility u = new Utility();
		System.out.println(Utility.sum(101,202));
		
		
		// How to access square method it is default
		System.out.println("Square method :- "+a.square(10));
		
		System.out.println(Utility.power(2,4));
	}
}