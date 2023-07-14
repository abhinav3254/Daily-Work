package exception;

import java.util.Scanner;

public class MainTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("num1:- ");
//		int num1 = sc.nextInt();
//		System.out.print("num2:- ");
//		int num2 = sc.nextInt();
		try {
			UtilityTwo.d();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("******The End******");
		sc.close();
	}
}
