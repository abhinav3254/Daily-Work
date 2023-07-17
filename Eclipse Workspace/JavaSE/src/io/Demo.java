package io;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\AbKumar\\Desktop\\assignment\\assignment.txt");
		System.out.println("file.getName() :- "+file.getName());
		System.out.println("file.getParent() :- "+file.getParent());
		System.out.println("file.length() :- "+file.length());
		System.out.println("File :- "+file.isFile());
		System.out.println("Directory :- "+file.isDirectory());
		System.out.println("file.canRead "+file.canRead());
		System.out.println("file.canExecute "+file.canExecute());
		System.out.println(file.delete());
		
	}
}
