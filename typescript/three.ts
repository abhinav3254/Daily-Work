class Employee {
	private emplId:number;
	private ename:String;
	private salary:number;
	
	// constructor
	
	public constructor(emplId:number,ename:String,salary:number) {
		this.emplId = emplId;
		this.ename = ename;
		this.salary = salary;
	}
	
	public getEmpId() : number {
		return this.emplId;
	}
	public getEname () : String {
		return this.ename;
	}
	
	public getSalary () : number {
		return this.salary;
	}
}

let emp = new Employee(101,"Ajay Saxena",250000);

console.log("Emp id :- "+emp.getEmpId());
console.log("Emp Name :- "+emp.getEname());
console.log("Emp Salary :- "+emp.getSalary());
