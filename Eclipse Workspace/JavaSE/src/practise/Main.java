package practise;


public class Main {
	public static void main(String[] args) {
		DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();
		dynamicArray.add(10);
		dynamicArray.add(10);
		dynamicArray.add(10);
		dynamicArray.add(10);
		dynamicArray.add(10);
		
		
		DynamicArray<String> dynamicArray2 = new DynamicArray<String>();
		dynamicArray2.add("A");
		dynamicArray2.add("B");
		dynamicArray2.add("C");
		dynamicArray2.add("D");
		dynamicArray2.add("E");
		
		
		dynamicArray.printAll();
		System.out.println();
		dynamicArray2.printAll();
		
	}
}
