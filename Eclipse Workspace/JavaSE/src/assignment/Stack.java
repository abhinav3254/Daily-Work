package assignment;

public class Stack {
	private int[] arr;
	private int size;
	private int ptr;
	
	
	public Stack () {
		this.arr = new int[5];
		this.size = 5;
		this.ptr = -1;
	}


	public Stack(int[] arr, int size) {
		super();
		this.arr = arr;
		this.size = size;
		this.ptr = -1;
	}
	
	public void push (int num) {
		if (ptr<size) {
			ptr = ptr + 1;
			arr[ptr] = num;
		} else {
			throw new StackOverFlowException("Stack OverFlow");
		}
	}
	
	public int pop() {
		int val = 0;
		if (ptr == -1) {
			throw new StackUnderFlowException("Stack UnderFlow");
		} else {
			val = arr[ptr];
			ptr = ptr - 1;
		}
		return val;
	}
	
}
