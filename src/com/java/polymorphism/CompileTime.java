package com.java.polymorphism;

public class CompileTime {
	
	public void abc(int a, String b) {
		System.out.println("ONE");
	}
	
	public void abc(String a, int b) {
		System.out.println("TWO");
	}
	
	public void abc(String a, int... b) {
		System.out.println("THREE");
	}
	
	public static void main(String args[]) {
		CompileTime obj = new CompileTime();
		
		obj.abc("Sushi", 1);
		obj.abc("Sushi", 1,2,3,4,5);
		obj.abc(1, "Sushi");
		obj.abc('a',"Sushi");	//	(char --> int) if no matching found in methods, then one type is promoted to another
	} 

}
