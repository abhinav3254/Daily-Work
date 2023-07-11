package oops;

public class Employee {
	int employeeId;
	String name;
	double salary;
	Address[] address;
	
	public Employee () {}

	public Employee(int employeeId, String name, double salary, Address[] address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}
	
	
}
