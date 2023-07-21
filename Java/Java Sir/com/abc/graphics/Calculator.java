package com.abc.graphics;


public class Calculator {
	public static final float PI = 3.14f;
	public static double sum (double num1, double num2) {
		return num1 + num2;
	} 
	
	public static int power (int num1,int num2) {
		while (num2>0) {
			num1 = num1+num1;
		}
		
		return num1;
	}
}