package exception;

import javax.management.RuntimeErrorException;

public class P1 {
	private String name;
	private int age;
	
	P1 (String name,int age) {
		this.name = name;
		if (age>=18 ) {
		this.age = age;
		} else {
			throw new RuntimeErrorException(null, "Invalid Age--");
		}
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public void getDetails () {
		System.out.println("Hello "+name+" and your age is "+age);
	}

	@Override
	public String toString() {
		return "P1 [name=" + name + ", age=" + age + "]";
	}
	
}
