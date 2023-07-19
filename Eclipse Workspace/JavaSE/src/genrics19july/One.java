package genrics19july;

public class One {
	public static void main(String[] args) {
		Integer[] integer = {10,20,30,40,50};
		Double[] floatArr = {1d,2d,3d,4d,5d};
		TypeSafetyDemo<Integer> ts1 = new TypeSafetyDemo(integer);
		TypeSafetyDemo<Integer> ts2 = new TypeSafetyDemo(floatArr);
		double sum = ts1.getAverage();
		System.out.println(sum);
		sum = ts2.getAverage();
		System.out.println(sum);
		
		System.out.println(ts1.areAveragesSame(ts2));
		
		System.out.println(ts1.sum1(10, 21));
	}
}

class TypeSafetyDemo<T extends Number> {
	T[] a;
	
	public TypeSafetyDemo(T[] a) {
		this.a = a;
	}
	
	public <T extends Number> double getAverage(){
		double sum = 0.0;
		for (int i = 0;i<a.length;i++) {
			sum = sum + a[i].doubleValue();
		}
		return sum/a.length;
	}
	
	public boolean areAveragesSame(TypeSafetyDemo<?> ts) {
		return getAverage() == ts.getAverage();
	}
	
	public double sum1(T num1,T num2) {
		return num1.doubleValue()+num2.doubleValue();
	}
	
}
