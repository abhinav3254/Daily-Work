
import java.time.LocalDate;

class Test {
	public static void main (String[] args) {
		Account a1 = new Account(7001,15000.00,"Ajay Saxena",LocalDate.now());
		Account a2 = new Account(7001,15000.00,"Ajay Saxena",LocalDate.now());
		System.out.println(a1);	
		System.out.println(a1.equals(a2));			
	}
}