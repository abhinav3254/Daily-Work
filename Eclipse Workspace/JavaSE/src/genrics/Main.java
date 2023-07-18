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
		
		Integer[] arr2 = new Integer[5];
		Stack<Integer> stack2 = new Stack<Integer>(arr2);
		for (int i = 1;i<6;i++) {
			stack2.push(10*i);
		}
		
		for (int i = 1;i<6;i++)
			System.out.println(stack2.pop());
		
	}
}
