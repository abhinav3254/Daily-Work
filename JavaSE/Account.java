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
	
	// ToString method
	
	public String toString() {
		return "Account Number :-"+accountNumber+
		" \nBalance :- "+balance+
		" \nAccount Holder Name :- "+accountHolderName+
		" \nAccount Opening Date :- "+openedDate;
	}
	
	// equals Method
	
	public boolean equals (Object object) {
		
		if (object instanceof Account) {
			Account a = (Account)object;
			return (accountNumber == a.accountNumber && balance == a.balance && accountHolderName.equals(a.accountHolderName) && openedDate.equals(a.openedDate));
		}
		return false;
	}
	
}