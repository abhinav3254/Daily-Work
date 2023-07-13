package assignment;

public class Age {
	private int age;

	public Age() {
	}
	
	public Age (int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void validateAge () {
		if (age>=18) {
			System.out.println("You are eligeble");
		} else {
			throw new IsValidateException("You are not eligble");
		}
	}
	
}
