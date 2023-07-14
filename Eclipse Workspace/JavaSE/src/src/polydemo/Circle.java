package polydemo;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		System.out.println("Circle");
		return 3.14*radius*radius;
	}
}
