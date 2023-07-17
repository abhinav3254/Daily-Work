//package io;
//
//import java.io.BufferedOutputStream;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Demo3 {
//	public static void main(String[] args) throws IOException {
//		try {
//			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\AbKumar\\Desktop\\assignment\\one1.txt");
//			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream,500);
//			for (int i = 61;i<91;i++) {
//				bufferedOutputStream.write(i);
//			}
//			
//			FileWriter fileWriter = new FileWriter("C:\\Users\\AbKumar\\Desktop\\assignment\\one1.txt");
//			bufferedOutputStream = new BufferedOutputStream(fileWriter,500);
//			
//			for (int i = 97;i<=122;i++) {
//				bufferedOutputStream.write(i);
//			}
//			
//			bufferedOutputStream.close();
//			fileOutputStream.close();
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		
//	}
//}
