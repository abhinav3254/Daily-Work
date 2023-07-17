package io;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\demo.txt");
		
		int ch;
		
		while ((ch = fileInputStream.read()) != -1) {
			System.out.print((char)ch);
		}
		fileInputStream.close();
	}

}

// try with resource
//FileInputStream fileInputStream = null;
//try (fileInputStream = new FileInputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\demo.txt") {
//	
//}