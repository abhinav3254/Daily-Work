package inheritance;

public class Car extends Vehicle {
	private String type;
	private String number;
	private Engine engine;
	
	public Car () {}
	
	public Car (Engine engine) {
		this.engine = engine;
	}
	
	public Car(String brand, int numberOfWheels,String type,String number,Engine engine) {
		super(brand, numberOfWheels);
		this.type = type;
		this.number = number;
		this.engine = engine;
	}

	public String getType() {
		return type;
	}

	public String getNumber() {
		return number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void getCarDetails (Engine engine1) {
		Engine engine = engine1;
		engine.getEngineDetails();
//		String details = "Car Name :- "+getCarDetails(engine1);
	}
}
