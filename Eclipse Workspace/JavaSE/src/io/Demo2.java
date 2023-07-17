package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\demo.txt");
		
		int ch;
		
		while ((ch = fileInputStream.read()) != -1) {
			System.out.print((char)ch);
		}
		fileInputStream.close();
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\abc.txt");
		for (int i = 97; i >= 0; i--) {
			fileOutputStream.write(i);
		}
		fileOutputStream.close();
	}

}

// try with resource
//FileInputStream fileInputStream = null;
//try (fileInputStream = new FileInputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\demo.txt") {
//	
//}