package com.java.constructor;

// If we wan't that, no other class should make the object, then, we use private constructor.
// If we want to make the object of class containing private constructor, then we have to make its object in that class only..

public class PrivateConstructor {
	String name; int DOB;
	private PrivateConstructor(String name, int DOB) {
		this.name = name;
		this.DOB = DOB;
	}
	
	public void showInfo() {
		System.out.println("Name: "+name+"\nDOB: "+DOB);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateConstructor c = new PrivateConstructor("Sushil", 8599);
		c.showInfo();
	}
}