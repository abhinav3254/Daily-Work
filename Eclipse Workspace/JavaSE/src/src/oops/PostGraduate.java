package oops;

import java.time.LocalDateTime;

public class PostGraduate extends Student{
	
	private String enrollmentNumber;
	private int collegeId;
	private String course;
	private int courseDuration;
	private String club;
	
	public PostGraduate () {}

	public PostGraduate(int ssn, String name, int age, String gender, String city, LocalDateTime dateOfBirth, int rollNumber, int admissionNumber, int schoolId, int classStudy, String house,String enrollmentNumber, int collegeId, String course, int courseDuration, String club) {
		super(ssn,name,age,gender,city,dateOfBirth,rollNumber,admissionNumber,schoolId,classStudy,house);
		this.enrollmentNumber = enrollmentNumber;
		this.collegeId = collegeId;
		this.course = course;
		this.courseDuration = courseDuration;
		this.club = club;
	}

	public String getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(String enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "PostGraduate [enrollmentNumber=" + enrollmentNumber + ", collegeId=" + collegeId + ", course=" + course
				+ ", courseDuration=" + courseDuration + ", club=" + club + ", getRollNumber()=" + getRollNumber()
				+ ", getAdmissionNumber()=" + getAdmissionNumber() + ", getSchoolId()=" + getSchoolId()
				+ ", Class ofStudy()=" + getClassStudy() + ", getHouse()=" + getHouse() + ", toString()="
				+ super.toString() + ", ssn=" + getSsn() + ", Name =" + getName() + ", Age" + getAge()
				+ ", Gender()=" + getGender() + ", City =" + getCity() + ", Date Of Birth " + getDateOfBirth()
				+ "]";
	}
	
	
	
}
