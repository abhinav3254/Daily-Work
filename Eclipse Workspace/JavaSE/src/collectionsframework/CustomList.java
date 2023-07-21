package collectionsframework;

import java.util.LinkedList;

import genrics.Employee;

public class CustomList {
	
	public static void main(String[] abhinav) {
		abhinav = new String[2];
		abhinav[0] = "args";
//		
//		LinkedList<String> list = new LinkedList<String>();
//		
//		list.add("WELCOME");
//		list.add("BANANA");
//		list.add("HELLO");
//		list.add("APPLE");
//		
//		System.out.println(list.toString());
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(new Employee(102, "Bhavesh", 15000));
		list.add(new Employee(104, "Utkarsh", 14000));
		list.add(new Employee(106, "Anand", 20000));
//		list.add(new Employee(108, "Gautam", 22222));
//		
//		System.out.println(list.toString());
//		
//		System.out.println(list.remove(list.add(new Employee(106, "Anand", 20000))));
//		System.out.println();
//		System.out.println(list.toString());
//		
	}
}
