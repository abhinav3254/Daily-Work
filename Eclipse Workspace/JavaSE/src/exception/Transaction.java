package exception;

public class Transaction {
	public static void deposit(Account account,double amount) {
		account.setBalance(account.getBalance()+amount);
	}
	public static void withdraw (Account account,double amount) {
		double balance = account.getBalance();
		if (balance - amount >= 1000)
			account.setBalance(balance-amount);
		else
		throw new InsufficeintBalanceException("Insufficent Funds !!!");
	}
}
