package polydemo;


public class Test {
	public static void main(String[] args) {
//		A a = new B();
//		// a.methodA();
//		// System.out.println(a.x);
//		
//		A a1 = new C();
//		// a1.methodA();
//		// System.out.println(a1.x);
//		
//		a.show();
//		a1.show();
		
		Shape s = null;
		int noCircle = 0;
		int noRectangle = 0;
		int noTriangle = 0;
		
		for (int i = 0; i < 10; i++) {
			s = ShapeFactory.produceShape();
			System.out.println(s.area());
			
			if (s instanceof Circle) noCircle++;
			else if (s instanceof Rectangle) noRectangle++;
			else noTriangle++;
		}
		
		System.out.println("No of Circle is :- "+noCircle);
		System.out.println("No of Rectangle is :- "+noRectangle);
		System.out.println("No of Triangle is :- "+noTriangle);
		
	}
}
