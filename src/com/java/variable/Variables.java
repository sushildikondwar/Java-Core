package com.java.variable;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AnotherVariable.staticVariable);	//	static variable
		
		AnotherVariable obj = new AnotherVariable();
		System.out.println(obj.instanceVariable);	//	instance variable
		
		String title = "AkaSushi :)";
		System.out.println(title);

	}
}
