package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Demo4 {
	public static void main(String[] args) throws Exception {
		int i = 99999;
		long l = 99999999999l;
		float f= 99.99f;
		double d = 123456789.00d;
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\abc.txt");
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		dataOutputStream.writeInt(i);
		dataOutputStream.writeLong(l);
		dataOutputStream.writeFloat(f);
		dataOutputStream.writeDouble(d);
		dataOutputStream.close();
		fileOutputStream.close();	
	}
}
