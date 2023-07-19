package genrics19july;

import genrics.Employee;

public class Three {
	public static void main(String[] args) {
		String[] str ={"Welcome","Hello","Bye-Bye"};
		GenDemoImpl<String> gdl = new GenDemoImpl<String>(str);
		gdl.printArray(str);
		
		Employee[] earr = {new Employee(101, "Krish", 18000),new Employee(102, "Raman", 19000)};
		GenDemoImpl<Employee> gd2 = new GenDemoImpl(earr);
		gd2.printArray(earr);
	}
}

interface GenDemo<T> {
	void printArray(T[] a);
}

class GenDemoImpl<T> implements GenDemo<T> {
	T[] a;
	public GenDemoImpl(T[] a) {this.a= a;}
	
	public void printArray(T[] a) {
		for (int i = 0;i<a.length;i++)
			System.out.println(a[i]);
	}
}