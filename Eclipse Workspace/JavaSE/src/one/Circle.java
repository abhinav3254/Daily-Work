package one;

public class Circle {
	private double radius;
	
	Circle () {}
	Circle (double radius) {
		this.radius = radius;
	}
	
	public void setRadius (double radius) {
		this.radius = radius;
	}
	
	public double getRadius () {
		return this.radius;
	}
}
