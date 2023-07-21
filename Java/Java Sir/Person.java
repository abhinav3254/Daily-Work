class Person {
	private int ssn;
	private String name;
	private int age;
	public Person () {}
	
	public Person (int ssn,String name,int age) {
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}
	
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public String getName () {
		return name;
	}
	
	public int getAge () {
		return age;
	}
	
	public int getSsn () {
		return ssn;
	}
}