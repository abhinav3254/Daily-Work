package polydemo;

public class PersonalLoan extends Loan {
	private String amount;
	
	public PersonalLoan(double loanAmount, double tenure, double rateOfIntrest, String amount) {
		super(loanAmount, tenure, rateOfIntrest);
		this.amount = amount;
		
	}

	Loan loan = null ;

	public double calculateEmi() {
		
		double P = getLoanAmount();
		double R = getRateOfIntrest();
		double T = getTenure();

		System.out.println("Personal Loan");
		double emi = P*R*(Math.pow((1+R), T))/(Math.pow((1+R), (T-1)));
		
		return emi;
	}
}
