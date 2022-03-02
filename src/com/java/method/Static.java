package com.java.method;

/**
 * Static Method belongs to Class, not to the Object
 * Static Method doesn't need any object to call it, can be directly called using Class name
 * Static Method can access only static data, and cannot access non-static(instance) data
 * Static Method can call only other static methods, and cannot call a non-static(instance) method
 * Static Method cannot refer to "this" or "super" keyword in anyway	*/

public class Static {
	
	int x = 111111111;
	static int y = 999999999;
	
	public static void staticMeth() {
		for (int i=0; i<5; i++) {
		System.out.println("This is a Static Method");
//		System.out.println(x);	THIS THROWS AN ERROR
		System.out.println(y);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMeth();	//	Doesn't require object

	}

}
