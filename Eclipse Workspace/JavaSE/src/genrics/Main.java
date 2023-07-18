package genrics;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] arr = new String[4];
		Stack<String> stack = new Stack<>(arr);
		stack.push("Abhinav");
		stack.push("Yash");
		stack.push("Ajay");
		stack.push("Harsh");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
