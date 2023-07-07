


class Test {
	public static void main (String[] args) {
		Employee e = new Employee(7001,"Ajay Sharma",34,5678,670000,"ABC Corp");
		System.out.println("ssn :- "+e.getSsn());
		System.out.println("Name :- "+e.getName());
		System.out.println("Age :- "+e.getAge());
		System.out.println("EmpId :- "+e.getEmpId());
		System.out.println("Salary :- "+e.getSalary());
		System.out.println("orgName :- "+e.getOrgName());
	}
}