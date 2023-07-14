package oops;

public class Main2 {
public static void main(String[] args) {
	Address[] addressesList = new Address[1];
	// String houseNumber, String street, String cityName, String state
	addressesList[0] = new Address("12","MG Road","HYD","TLS");
	
	Employee[] elist = new Employee[1];
	// int employeeId, String name, double salary, Address address
	elist[0] = new Employee(101,"new",5000.0,addressesList);
	
	// String companyName, String companyLocation, Department[] department
	
	// int number, String name, String location, Employee[] employee
	Department[] departmentsList = new Department[2];
	departmentsList[0] = new Department(113,"IT Sector","USA",elist);

	departmentsList[1] = new Department(109,"Finance Sector","Hungary",elist);
	
	Company company = new Company("ABC-Corp","Mumbai",departmentsList);
	
	System.out.println("___________");
	System.out.println("Company Name :- "+company.getCompanyName());
	System.out.println("Company Location :- "+company.getCompanyLocation());
	System.out.println("_________Department Details_________");
	for (Department department : company.getDepartment()) {
		System.out.println("Department number  :- "+department.getNumber());
		System.out.println("Department Name  :- "+department.getName());
		System.out.println("Department Location  :- "+department.getLocation());
		System.out.println("_________Employee_________");
		for (Employee employee : department.getEmployee()) {
			System.out.println(employee.getEmployeeId());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			System.out.println("_________Address_________");
			for (Address address : employee.getAddress()) {
				System.out.println("getCityName"+address.getCityName());
				System.out.println("getHouseNumber"+address.getHouseNumber());
				System.out.println("getState"+address.getState());
				System.out.println("getStreet"+address.getStreet());
				
			}
		}
	}
	
}
}
