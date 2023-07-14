package inheritance;

public class Main {
	public static void main(String[] args) {
		Engine engine = new Engine("1400 hp", 51, 5, 1);
		Car car = new Car();
		car.getCarDetails(engine);
	}
}
