package serialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws Exception {
		
//		Serialization
		
		Employee employeeAnil = new Employee(101,"Anil Yadav",2500,LocalDate.of(2000, 10, 6));
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\employee.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employeeAnil);
		objectOutputStream.close();
		fileOutputStream.close();
		
		// DSerialization
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\employee.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Employee employee = (Employee)objectInputStream.readObject();
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getDateOfBirth());
		
		objectInputStream.close();
		fileInputStream.close();
	}
}
