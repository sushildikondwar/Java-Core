package com.java.constructor;

public class Copy {
	private int x, y;
	
	Copy(int a, int b) {	//	Parameterized Constructor
		System.out.println("This Class has two constructors, this constructor is a parameterized constructor which is being copied into a copy constructor");
		this.x = a;
		this.y = b;
	}
	
	Copy(Copy c1) {	//	Copy Constructor
		System.out.println("This is a Copy Constructor having a parameter of another object reference");
		this.x = c1.x;
		this.y = c1.y;
	}

}
