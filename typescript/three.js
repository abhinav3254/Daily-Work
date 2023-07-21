var Employee = /** @class */ (function () {
    // constructor
    function Employee(emplId, ename, salary) {
        this.emplId = emplId;
        this.ename = ename;
        this.salary = salary;
    }
    Employee.prototype.getEmpId = function () {
        return this.emplId;
    };
    Employee.prototype.getEname = function () {
        return this.ename;
    };
    Employee.prototype.getSalary = function () {
        return this.salary;
    };
    return Employee;
}());
var emp = new Employee(101, "Ajay Saxena", 250000);
console.log("Emp id :- " + emp.getEmpId());
console.log("Emp Name :- " + emp.getEname());
console.log("Emp Salary :- " + emp.getSalary());
