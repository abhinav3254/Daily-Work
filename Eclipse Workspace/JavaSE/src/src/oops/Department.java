package oops;

public class Department {
	private int number;
	private String name;
	private String location;
	
	Employee[] employee;
	
	public Department () {}

	public Department(int number, String name, String location, Employee[] employee) {
		super();
		this.number = number;
		this.name = name;
		this.location = location;
		this.employee = employee;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	
}
