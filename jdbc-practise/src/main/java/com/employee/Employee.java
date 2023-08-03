package com.employee;

public class Employee {
    private int id;
    private String name;
    private String address;
    private int age;
    private String salary;
    private String role;

    public Employee() {
    }

    public Employee(String name, String address, int age, String salary, String role) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
        this.role = role;
    }
    
    

    public Employee(int id, String name, String address, int age, String salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
		this.role = role;
	}

	// Getters and Setters for each field
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", salary='" + salary + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

