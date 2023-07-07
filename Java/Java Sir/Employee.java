class Employee extends Person {
	private int empId;
	private double salary;
	private String orgName;
	
	public Employee () {}
	
	public Employee (int ssn,String name,int age,int empId,double salary,String orgName) {
		super(ssn,name,age);
		this.empId = empId;
		this.salary = salary;
		this.orgName = orgName;
	}
	
	public void setEmpId (int empId) {
		this.empId = empId;
	} 
	
	public void setSalary (double salary) {
		this.salary = salary;
	}
	
	public void setOrgName (String orgName) {
		this.orgName = orgName;
	}
	
	public int getEmpId () {
		return empId;
	}
	
	public double getSalary () {
		return salary;
	}
	
	public String getOrgName () {
		return orgName;
	}
	
}