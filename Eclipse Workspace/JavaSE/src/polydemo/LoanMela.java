package polydemo;

import java.util.Random;

public class LoanMela {
	public static Loan approveLoan() {
		switch (new java.util.Random().nextInt() % 3) {
		case 0: 
			return new VehicleLoan(25000, 4, 4, "VehicleLoan", "150000");
		case 1: 
			return new PersonalLoan(13000, 5, 10, "140000");
			default: 
				return new HomeLoan(10000, 20, 6, "140000","12x12");
			
		}
	}
}
