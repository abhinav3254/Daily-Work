package com.abc.graphics;

public class Rectangle {
	private double length;
	private double breadth;
	
	public Rectangle () {}
	
	public Rectangle (double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area () {
		System.out.println("Area of Rectangle :-"+length * breadth);
	}
}