package oops;

public class Address {
	String houseNumber;
	String street;
	String cityName;
	String state;
	
	public Address () {}

	public Address(String houseNumber, String street, String cityName, String state) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.cityName = cityName;
		this.state = state;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
