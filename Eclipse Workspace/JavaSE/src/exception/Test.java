package exception;

public class Test {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		int[] arr = {10,20};
		
		System.out.println("begin");
		try {
			System.out.println(x/y);
			System.out.println(arr[y]);
		}
//			catch (ArithmeticException e) {
//			System.out.println(e.getLocalizedMessage());
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getLocalizedMessage());
//		} 
			catch (Exception e) {
			System.out.println("Parent :- "+e.getLocalizedMessage());
		} 
		
		System.out.println("End");
	}
}
