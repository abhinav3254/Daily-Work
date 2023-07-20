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
//		System.out.println("List Size :- "+list.size());
//		System.out.println(list.toString());
//		System.out.println("Empty :- "+list.isEmpty());
		
//		for (int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println("****list iterator****");
//		ListIterator<String> itr = list.listIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		while(itr.hasPrevious())
//			System.out.println(itr.previous());
//
//			System.out.println(list.remove("Apple"));
			
//		list.clear();
		
//		System.out.println(list.toString());
		
		ArrayList<String> list2 = new ArrayList<>();
//		list2.addAll(list);
//		System.out.println("List 2"+list2.toString());
//		System.out.println("List 1"+list.toString());
		
		/*
		list.removeAll(list2);
		System.out.println(list.toString());
		System.out.println(list2.toString());
		*/
		
//		list.retainAll(list2);
//		System.out.println("List 1 retain :- "+list.toString());
//		System.out.println("List 2 retain :- "+list2.toString());
		
		list2.add("Welcome1");
		list2.add("Hello");
		list2.add("Apple");
		list2.add("Zeba");
		list2.add(2,"Two");
		
		System.out.println(list2.containsAll(list));
		
	}
}
