package collectionsframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class One {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Empty :- "+list.isEmpty());
		list.add("Welcome");
		list.add("Hello");
		list.add("Apple");
		list.add("Zeba");
		list.add(2,"Two");
		System.out.println("List Size :- "+list.size());
		System.out.println(list.toString());
		System.out.println("Empty :- "+list.isEmpty());
		
//		for (int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		System.out.println("****list iterator****");
		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}
}
