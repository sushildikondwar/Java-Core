package com.java.superkeyword;

//	SUPER METHOD SHOULD NOT BE USED IN THE MAIN METHOD

public class Main {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println("----------------");
		
		c.method();
		System.out.println("----------------");
		
		System.out.println(c.s + " is a String attribute from child");
		System.out.println("----------------");
		
		c.fetchParentMethod();

	}

}
