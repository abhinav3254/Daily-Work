class Six {
	public static void main (String[] args) {
		Stack stack = new Stack(2);
	
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.peek();
	}
}

class Stack {
	
	private int[] arr;
	private int size;
	private int ptr = -1;
	
	// Default Constructor
	
	Stack () {
		this.size = 5;
		this.arr = new int[5];
	}
	
	// Size defined Constructor
	
	Stack (int size) {
		this.size = size;
		this.arr = new int[size];
	}
	
	
	// pop method
	
	public int pop () {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			int data = arr[ptr];
			ptr = ptr-1;
			System.out.println(data);
		    return data;
		}
	}
	
	// push method
	
	public void push (int data) {
		if (isFull()) {
			System.out.println("Stack Overflow");
		}else {
			ptr = ptr+1;
		    arr[ptr] = data;
		}
	}
	
	// peek stack
	
	public void peek () {
		if (isEmpty())
			System.out.println("Can't Peek Empty STACK");
		else
		System.out.println(arr[ptr]);
	}
	
	// check stack is already full or not
	
	private boolean isFull () {
		return ptr == size-1;
	}
	
	// check stack is underflow 
	
	private boolean isEmpty() {
		return ptr == -1;
	}
	
}