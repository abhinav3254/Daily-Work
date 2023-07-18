package genrics;

public class Two {
	public static void main(String[] args) {
		
		// BOXING 
		
		Integer integer = new Integer(10);
		int x = 20;
		Integer integer2 = new Integer(x);
		Integer integer3 = Integer.valueOf(20);
		
		System.out.println(integer);
		System.out.println(integer2);
		System.out.println(integer3);
		
		// UNBOXING
		
		int a1 = integer.intValue();
		int a2 = integer2.intValue();
		int a3 = integer3.intValue();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}
}
