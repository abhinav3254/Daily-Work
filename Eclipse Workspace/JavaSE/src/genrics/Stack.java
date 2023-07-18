package genrics;

public class Stack<T> {
	private T[] a;
	private int index = -1;
	public Stack(T[] a) {this.a = a;}
	
	private boolean isFull() {
		return index == 9;
	}
	
	private boolean isEmpty() {
		return index == -1;
	}
	
	public void push(T element) {
		if(!isFull()) {
			a[++index] = element;
		} else {
			throw new RuntimeException("Stack Overflow");
		}
	}
	
	public T pop() {
		if (!isEmpty())
			return a[index--];
		throw new RuntimeException("Stack Underflow");
	}
}
