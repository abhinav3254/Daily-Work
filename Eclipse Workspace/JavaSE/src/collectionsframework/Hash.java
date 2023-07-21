package collectionsframework;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(1);
		set.add("Hello");
		set.add("Welcome");
		set.add("Apple");
		set.add("Zebra");
		set.add("Banana");
		
		System.out.println(set.toString());
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.contains("Hello"));
		System.out.println("First way to print set");
		for (String s:set)
			System.out.print(s+" ");
		System.out.println();
		System.out.println("second way to print set");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next()+"  ");
	}
}