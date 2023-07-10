import java.time.LocalDate;

class Account {
	
	private int accountNumber;
	private double balance;
	private String accountHolderName;
	private LocalDate openedDate;
	
	public Account() {}
	
	public Account (int accountNumber,double balance,String accountHolderName,LocalDate openedDate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.openedDate = openedDate;
	}
	
	public String toString() {
		return accountNumber+" "+balance+" "
		+accountHolderName+" "+openedDate;
	}
	
}