package com.java.toString;

public class ToStringClass {
	
	public String toString() {	//	This is the internal method, which runs when tried to print the class object
		return "This is a Default String Print as a result of printing an object";
	}

	public static void main(String[] args) {
		
		ToStringClass obj = new ToStringClass();
		System.out.println(obj);	//	Here, the object has been provided as a parameter to the println class
		
	}

}
