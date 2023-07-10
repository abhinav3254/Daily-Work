package oops;

import java.time.LocalDateTime;

public class Student extends Person {
	private int rollNumber;
	private int admissionNumber;
	private int schoolId;
	private int classStudy;
	private String house;
	
	public Student () {
		super();
	}

	public Student(int ssn, String name, int age, String gender, String city, LocalDateTime dateOfBirth, int rollNumber, int admissionNumber, int schoolId, int classStudy, String house) {
		super(ssn,name,age,gender,city,dateOfBirth);
		this.rollNumber = rollNumber;
		this.admissionNumber = admissionNumber;
		this.schoolId = schoolId;
		this.classStudy = classStudy;
		this.house = house;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(int admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public int getClassStudy() {
		return classStudy;
	}

	public void setClassStudy(int classStudy) {
		this.classStudy = classStudy;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", admissionNumber=" + admissionNumber + ", schoolId=" + schoolId
				+ ", classStudy=" + classStudy + ", house=" + house + ", getSsn()=" + getSsn() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getCity()=" + getCity()
				+ ", getDateOfBirth()=" + getDateOfBirth() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
