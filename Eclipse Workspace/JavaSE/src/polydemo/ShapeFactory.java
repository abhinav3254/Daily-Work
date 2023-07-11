package polydemo;

public class ShapeFactory {
	public static Shape produceShape() {
		switch (new java.util.Random().nextInt() % 3) {
		case 0: 
			return new Circle(4.5);
		case 1: 
			return new Rectangle(6.5, 5.6);
			default: 
				return new Triangle(7.8,6.7);
		}
	}
}
