package assignment;

public class StackMain {
	public static void main(String[] args) {
		Stack stack = new Stack();
		try {
			stack.push(1);
			stack.push(2);
			stack.push(3);
//			stack.push(4);
			stack.push(5);
			stack.push(6);
			stack.push(7);
			stack.push(8);
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
//			System.out.println(stack.pop());
//			System.out.println(stack.pop());
//			System.out.println(stack.pop());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
