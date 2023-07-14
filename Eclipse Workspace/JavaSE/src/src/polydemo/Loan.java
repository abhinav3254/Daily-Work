package polydemo;

abstract public class Loan {
	private double loanAmount;
	private double tenure;
	private double rateOfIntrest;
	
	abstract public double calculateEmi();

	public Loan(double loanAmount, double tenure, double rateOfIntrest) {
		super();
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.rateOfIntrest = rateOfIntrest;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}

	public double getRateOfIntrest() {
		return rateOfIntrest;
	}

	public void setRateOfIntrest(double rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}
	
	
	
}
