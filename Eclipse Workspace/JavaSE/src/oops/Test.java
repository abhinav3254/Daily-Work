package oops;

import java.time.LocalDateTime;

public class Test {
	public static void main(String[] args) {
		// int ssn, String name, int age, String gender, String city, LocalDateTime dateOfBirth
//		Person person = new Person(101,"Ajay Saxena",38,"Male","Hyderbad",LocalDateTime.of(2000,10,2,18,30,54));
//		System.out.println(person);
//		// int rollNumber, int admissionNumber, int schoolId, int classStudy, String house
//		Student student = new Student(101,"Ajay Saxena",38,"Male","Hyderbad",LocalDateTime.of(2000,10,2,18,30,54),10,5545,9080,9,"red");
//		System.out.println(student);
//		// String enrollmentNumber, int collegeId, String course, int courseDuration, String club
		PostGraduate postGraduate = new PostGraduate(101,"Ajay Saxena",38,"Male","Hyderbad",LocalDateTime.of(2000,10,2,18,30,54),10,5545,9080,9,"red","431CS7090",7765,"B.Tech",4,"Coding Club");
		System.out.println(postGraduate);
	}
}
