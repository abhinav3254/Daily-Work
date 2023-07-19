package genrics19july;

public class One {
	public static void main(String[] args) {
		Integer[] integer = {10,20,30,40,50};
		double sum = TypeSafetyDemo.getAverage(integer);
		System.out.println(sum);
		Double[] floatArr = {1d,2d,3d,4d,5d};
		sum = TypeSafetyDemo.getAverage(floatArr);
		System.out.println(sum);
	}
}

class TypeSafetyDemo {
	public static <T extends Number> double getAverage(T[] a){
		double sum = 0.0;
		for (int i = 0;i<a.length;i++) {
			sum = sum + a[i].doubleValue();
		}
		return sum/a.length;
	}
}
