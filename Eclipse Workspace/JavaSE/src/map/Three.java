package map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import genrics.Employee1;

public class Three {
	public static void main(String[] args) {
		
		TreeSet<Employee1> eSet = new TreeSet<>(new EmployeeSalaryComprartor());
		eSet.add(new Employee1(102, "Dinesh", 3000.003));
		eSet.add(new Employee1(104, "Babu", 1000.001));
		eSet.add(new Employee1(101, "Charan", 4000));
		eSet.add(new Employee1(103, "Ajay", 2000));
		
		
		System.out.println(eSet.add(new Employee1(104, "Dinesh", 4000)));
		
		for(Employee1 e:eSet) {
			System.out.println(e);
		}
		
		System.out.println("---------------------");
		
		Iterator<Employee1> itr = eSet.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
		
		Employee1 e1 = new Employee1(101, "Ajay", 1000.001);
		Employee1 e2 = new Employee1(102, "Babu", 2000.02);
		
		EmployeeEmpidComparator empidComparator = new EmployeeEmpidComparator();
		System.out.println(empidComparator.compare(e1, e2));
		System.out.println("Compare To:- "+empidComparator.compare(e1,e2));
	}
	
	static class EmployeeEmpidComparator implements Comparator<Employee1> {
		@Override
		public int compare(Employee1 e1, Employee1 e2) {
			return e1.getEmployeeName().compareTo(e2.getEmployeeName());
//			return e1.getEmpId()-e2.getEmpId();
		}	
	}
	
	static class EmployeeSalaryComprartor implements Comparator<Employee1> {

		@Override
		public int compare(Employee1 o1, Employee1 o2) {
			// TODO Auto-generated method stub
//			return o1.getSalary()-o2.getSalary();
			  return Double.valueOf(o1.getSalary()).compareTo(o2.getSalary());
		}
		
	}
	
}
