package com.java.abstraction.interfac;

public class Circle implements Shape{
	
	int radius;
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("Circle Initiated");
	}
	public void area() {
		System.out.println("Area: " + (3.14*radius*radius));
	}

}
