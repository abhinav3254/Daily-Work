package exception;

public class TestThree {
	public static void main (String[] args) {
		Account account = new Account(7001,"John Miller",7500);
		try {
			Transaction.withdraw(account, 60000);
		} catch (Exception e) {
			System.out.println(e);
		} System.out.println("Remaining Balance is :- "+account.getBalance());
	}
}
