package polydemo;

public class TestLoan {
	static Loan loan;
	public static void main(String[] args) {		
		int v = 0;
		int h = 0;
		int p = 0;

		for (int i = 0; i < 10; i++) {
			loan = LoanMela.approveLoan();
			System.out.println(loan.calculateEmi());
			if (loan instanceof VehicleLoan) v++;

			else if (loan instanceof HomeLoan) h++;
			else p++;
		}
	
	    System.out.println("No of Personal Loan is :- "+p);
		System.out.println("No of Home Loan is :- "+h);
		System.out.println("No of vehicle Loan is :- "+v);
//		
//		loan = LoanMela.approveLoan();
//		System.out.println(loan.calculateEmi());
		
	}
}
