
import java.util.Scanner;

class Salary {
	public static void main (String[] args) {
		System.out.println("Monthly Slaray");
		Scanner sc = new Scanner(System.in);
		long salary = sc.nextLong();
		
		System.out.println(calTax(salary));
		
		sc.close();
	}
	
	private static long calLpa (long s) {
		return s*12;
	}
	
	public static double calTax (long salary) {
		long s = calLpa(salary);
		double tax = 0;
		
		if (s<250000) {
			tax = 0;
		}
		if (s>250000 && s<500000) {
			// 10%
			s = s - 250000;
			tax = tax + (0.10*s);
		}
		if (s>500000 && s<1000000) {
			// 20%
			s = s - 500000;
			tax = tax + (0.20*s);
		}
		if (s>1000000) {
			// 30%
			s = s - 1000000;
			tax = tax + (0.30*s);
		}
		
		return tax;
			
	}
}