package genrics19july;

public class Two {
	public static void main(String[] args) {
		Integer[] integers = new Integer[10];
		MyStack<Integer> myStack = new MyStack(integers);
		for (int i = 1;i<=10;i++) {
			myStack.push(i);
		}
		
		for (int i = 1;i<11;i++) {
			System.out.println(myStack.pop());
		}
	}
}

class Stack<T> {
	T[] a;
	int index = -1;
	
	public Stack (T[] a) {
		this.a = a;
	}
	
	public boolean isEmpty() {
		return index == -1;
	}
	
	public boolean isFull() {
		return index == 9;
	}
}

class MyStack<T> extends Stack<T> {
	
	public MyStack(T[] a) {
		super(a);
	}

	public void push(T element) {
		if(!isFull())
			a[++index] = element;
		else
			throw new RuntimeException("Stack Overflow :- cannot insert more elements");
	}
	
	public T pop() {
		if (!isEmpty())
			return a[index--];
		else 
			throw new RuntimeException("Stack Underflow");
	}
}