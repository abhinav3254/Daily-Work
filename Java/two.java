import java.util.Scanner;
class two {
	public static void main (String[] args) {
		String name = "Abhinav";
		
		reverseName(name);
	}
	
	public static void reverseName (String name) {
		int lengthOfName = name.length()-1;
		String newName = "";
		for (int i = lengthOfName;i>=0;i--) {
			newName = newName+name.charAt(i);
		}
		
		System.out.println(newName);
	}
}