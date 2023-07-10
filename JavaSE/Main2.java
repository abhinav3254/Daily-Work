
import java.time.LocalDate;

class Test {
	public static void main (String[] args) {
		Account a = new Account(7001,15000.00,"Ajay Saxena",LocalDate.now());
		System.out.println(a);		
	}
}