package polydemo;

public class VehicleLoan extends Loan{
	private String type;
	private String price;
	Loan loan = null ;
	
	public VehicleLoan(double loanAmount, double tenure, double rateOfIntrest, String type, String price) {
		super(loanAmount, tenure, rateOfIntrest);
		this.type = type;
		this.price = price;
	}

	public double calculateEmi() {
		
		double P = getLoanAmount();
		double R = getRateOfIntrest();
		double T = getTenure();
		
		System.out.println("Vehicle Loan");
		double emi = P*R*(Math.pow((1+R), T))/(Math.pow((1+R), (T-1)));
		
		return emi;
	}
}
