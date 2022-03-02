package com.java.abstraction.interfac;

public class Rectangle implements Shape{	//	*MULTIPLE INHERITENCE* CAN BE ACHIEVED BY IMPLEMENTING MORE THAN ONE INTERFACES TO THE CLASS
	
	int length, breadth;
	
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void draw() {
		System.out.println("Rectangle Initiated!");
	}
	public void area() {
		System.out.println("Area: " + (this.length*this.breadth));
	}

}
