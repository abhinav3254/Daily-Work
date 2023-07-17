package serialization;

import java.time.LocalDate;

public class Employee implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private String employeeName;
	private double salary;
	private LocalDate dateOfBirth;
	
	public Employee () {}

	public Employee(int employeeId, String employeeName, double salary, LocalDate dateOfBirth) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
