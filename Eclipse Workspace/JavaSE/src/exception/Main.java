package exception;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 :- ");
		int num1 = sc.nextInt();
		System.out.print("num2 :- ");
		int num2 = sc.nextInt();
//		int[] arr = {10,20,30};
//		try {
//			System.out.println("Result is :- "+Utility.divide2(num1, num2));
//			System.out.println(arr[num2]);
//		} catch (ArithmeticException e) {
//			//System.out.println("Caught in Main");
//			System.out.println("Invalid Divide");
//			}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Invalid Index");
//			// returing bcz to check if then also finally executed or not
//			// return;
//			// System.exit() --> forcing jvm to shut down here finally we not be executed
//			System.exit(1);
//			}
//		finally {
//			System.out.println("Finally Block");
//		}
//		System.out.println("The End");
		
		try {
		System.out.println(UtilityTwo.divide(num1, num2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("The End");
		sc.close();
	}
}
