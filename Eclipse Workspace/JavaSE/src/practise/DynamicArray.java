package practise;


public class DynamicArray<T> {
	private Object[] arr;
	private int DEFAULT_SIZE;
	private int index;
	
	public DynamicArray () {
		this.DEFAULT_SIZE = 2;
		this.arr = new Object[DEFAULT_SIZE];
		this.index = 0;
	}
	
	public DynamicArray(int DEFAULT_SIZE) {
		this.arr = new Object[DEFAULT_SIZE];
		this.DEFAULT_SIZE = DEFAULT_SIZE;
		this.index = 0;
	}
	
	private void growArray() {
		Object[] temp = new Object[DEFAULT_SIZE*2];
		for (int i = 0;i<DEFAULT_SIZE;i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		DEFAULT_SIZE = DEFAULT_SIZE*2;
	}

	public void add(T data) {
		if (index == DEFAULT_SIZE) {
			growArray();
		}
		arr[index] = data;
		index = index + 1;
	}
	
	public void printAll () {
		for (Object i : arr)
			System.out.print(i+" ");
	}
	
}
