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
	public static int square (int x) {
		return x*x;
	}
	
}

class Test {
	public static void main(String[] args) {
		Utility u = new Utility();
		System.out.println(Utility.sum(101,202));
		System.out.println(Utility.square(10));
		System.out.println(Utility.power(2,4));
	}
}