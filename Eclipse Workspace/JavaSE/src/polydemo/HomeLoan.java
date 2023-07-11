package polydemo;

public class HomeLoan extends Loan {
	
	private String propertyValue;
	private String sizeOfProperty;
	
	public HomeLoan(double loanAmount, double tenure, double rateOfIntrest, String propertyValue,
			String sizeOfProperty) {
		super(loanAmount, tenure, rateOfIntrest);
		this.propertyValue = propertyValue;
		this.sizeOfProperty = sizeOfProperty;
	}




	
	public double calculateEmi() {
		
		double P = getLoanAmount();
		double R = getRateOfIntrest();
		double T = getTenure();

		System.out.println("Home Loan");
		double emi = P*R*(Math.pow((1+R), T))/(Math.pow((1+R), (T-1)));
		
		return emi;
	}
	
}
