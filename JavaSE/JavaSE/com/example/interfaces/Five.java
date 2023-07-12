interface Shape {
	double area();
}

class Circle {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double perimeter() {
		return 2.0 * 3.14 * radius;
	}
}

class Circle3D extends Circle implements Shape {
	public Circle3D(double radius) {
		super(radius);
	}
	
	public double area() {
		return 3.14*radius * radius;
	}
}

class Test {
	public static void main (String[] args) {
		Circle3D c = new Circle3D(5.4);
		System.out.println(c.perimeter());
		System.out.println(c.area());
	}
}