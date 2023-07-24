package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Four {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		// initial default capacity of 16
		map.put("abc@gmail.com", "abc@123");
		map.put("change@gmail.com", "change@123");
		map.put("abc@yahoo.com", "abc@123");
		map.put("new@gmail.com", "new@123");
//		System.out.println(map.size());
//		System.out.println(map.containsKey("abc@gmail.com"));
//		System.out.println(map.containsValue("new@123"));
//		
//		System.out.println(map.get("abc@gmail.com"));
		
//		System.out.println(map.remove("abc@gmail.com","abc@123"));
//		System.out.println(map.replace("new@gmail.com","Kushi"));
//		System.out.println(map.replace("abc@gmail.com","abc@123","Abhinav"));
//		System.out.println(map.toString());
//		System.out.println(map.put("abc@yahoo.com", "abc@123"));
		
		Set<String> keys = map.keySet();
		for (String k : keys)
			System.out.println(k+"    "+map.get(k));
		
		System.out.println("*************");
		
		Collection<String> values = map.values();
		for (String v:values)
			System.out.println(v);
		
	}
}
