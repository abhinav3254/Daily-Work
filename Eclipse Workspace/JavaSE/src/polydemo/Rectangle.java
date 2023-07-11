package polydemo;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	
	public Rectangle(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area () {
		System.out.println("Rectangle");
		return length*breadth;
	}
}
