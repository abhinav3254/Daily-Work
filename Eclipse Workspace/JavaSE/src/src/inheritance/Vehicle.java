package inheritance;

public class Vehicle {
	private String brand;
	private int numberOfWheels;
	public Vehicle() {}
	public Vehicle(String brand, int numberOfWheels) {
		super();
		this.brand = brand;
		this.numberOfWheels = numberOfWheels;
	}
	public String getBrand() {
		return brand;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
}
