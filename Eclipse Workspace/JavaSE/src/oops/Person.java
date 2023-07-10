package oops;

import java.time.LocalDateTime;

public class Person {
	private int ssn;
	private String name;
	private int age;
	private String gender;
	private String city;
	private LocalDateTime dateOfBirth;
	
	public Person () {}
	
	public Person(int ssn, String name, int age, String gender, String city, LocalDateTime dateOfBirth) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.dateOfBirth = dateOfBirth;
	}
	// getter and setters
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", age=" + age + ", gender=" + gender + ", city=" + city
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	
	
}
