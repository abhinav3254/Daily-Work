import oops.Address;
import oops.Department;
import oops.Employee;

public class Main {
	public static void main(String[] args) {
		/*
		Employee employee = new Employee(7001,"charan",7560,new Address("21","MG Road","Banglore","Karnatka"));
		 
		System.out.println("Employee Id :- "+employee.getEmployeeId());
		System.out.println("Employee Name :- "+employee.getName());
		System.out.println("Salary :- "+employee.getSalary());
		
		System.out.println("--------Address section------------");
		
		System.out.println("House Number :- "+employee.getAddress().getHouseNumber());
		System.out.println("Street :- "+employee.getAddress().getStreet());
		System.out.println("City :- "+employee.getAddress().getCityName());
		System.out.println("State :- "+employee.getAddress().getState());
		*/
		
		Employee[] employeesList = new Employee[3];
		employeesList[0] = new Employee(102,"Babu",2000,new Address("6/11","MG Road","Banglore","Karnatka"));
		employeesList[1] = new Employee(103,"Charan",4000,new Address("10","Anna Street","Chennai","Tamil Nadu"));
		employeesList[2] = new Employee(104,"Ajay",3000,new Address("21","HiTech City","Hyderbad","Telangana"));
		
		Department department = new Department(10,"Sales","Mumbai",employeesList);
		
		System.out.println("-----Department Details-----");
		System.out.println("Department Name :- "+department.getName());
		System.out.println("Department Number :- "+department.getNumber());
		System.out.println("Department Location :- "+department.getLocation());
		
		for (Employee employee : employeesList) {
			
			System.out.println("Employee Id :- "+employee.getEmployeeId());
			System.out.println("Employee Name :- "+employee.getName());
			System.out.println("Salary :- "+employee.getSalary());
			
			System.out.println("--------Address section------------");
			
			System.out.println("House Number :- "+employee.getAddress().getHouseNumber());
			System.out.println("Street :- "+employee.getAddress().getStreet());
			System.out.println("City :- "+employee.getAddress().getCityName());
			System.out.println("State :- "+employee.getAddress().getState());
		}
		
	}
}
