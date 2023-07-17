package io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Demo5 {
	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\abc.txt");
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);
		int i = dataInputStream.readInt();
		long l = dataInputStream.readLong();
		float f = dataInputStream.readFloat();
		double d = dataInputStream.readDouble();
		System.out.println(i+"  "+l);
		System.out.println(f+"  "+d);
		dataInputStream.close();
		fileInputStream.close();
	}
}
