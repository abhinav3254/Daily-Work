package com.abc.graphics;

public class Circle {
	private float radius;
	public Circle (float radius) {
		this.radius = radius;
	}
	
	public void findArea () {
		System.out.println("Area of the cirle is :- "+3.14*radius*radius);
	}
}