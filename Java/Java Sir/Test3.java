
class Test {
	public static void main (String[] args) {
		SalesMan e = new SalesMan(7001,"Ajay Sharma",34,5678,67000,"ABC Corp",9);
		System.out.println("ssn :- "+e.getSsn());
		System.out.println("Name :- "+e.getName());
		System.out.println("Age :- "+e.getAge());
		System.out.println("EmpId :- "+e.getEmpId());
		System.out.println("Salary :- "+e.getSalary());
		System.out.println("orgName :- "+e.getOrgName());
		System.out.println("Points :- "+e.getPoints());
		System.out.println("Incentives :- "+e.getPoints()*750);
		System.out.println("Total Salary :- "+(e.getSalary()+e.getPoints()*750));
	}
}