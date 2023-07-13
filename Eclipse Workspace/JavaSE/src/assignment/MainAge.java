package assignment;

public class MainAge {
	public static void main(String[] args) {
		Age age = new Age(20);
		try {
			age.validateAge();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
