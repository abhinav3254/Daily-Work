package inheritance;

public class Engine {
	private String power;
	private int fuelCapacity;
	private int version;
	private int torqueProduce;
	public Engine(String power, int fuelCapacity, int version, int torqueProduce) {
		super();
		this.power = power;
		this.fuelCapacity = fuelCapacity;
		this.version = version;
		this.torqueProduce = torqueProduce;
	}
	public String getPower() {
		return power;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public int getVersion() {
		return version;
	}
	public int getTorqueProduce() {
		return torqueProduce;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public void setTorqueProduce(int torqueProduce) {
		this.torqueProduce = torqueProduce;
	}
	
	public void getEngineDetails () {
		Car car = new Car();
		String details = "Engine Info ["
				+ car.getBrand()+" has a power of "+power
				+"\n , engine version is "+version
				+"\n ,produces the torque of "+torqueProduce
				+"\n ,it has a fuel capacity of "+fuelCapacity;
		System.out.println(details);
	}
}
