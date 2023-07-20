package collectionsframework;

import java.util.LinkedList;

public class CustomList {
	public static void main(String[] abhinav) {
		abhinav = new String[2];
		abhinav[0] = "args";
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("WELCOME");
		list.add("BANANA");
		list.add("HELLO");
		list.add("APPLE");
		
		System.out.println(list.toString());
		
	}
}
