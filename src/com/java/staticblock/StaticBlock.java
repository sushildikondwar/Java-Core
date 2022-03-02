package com.java.staticblock;

// as per the notes, 'static blocks always execute before main', but practically its not happening

public class StaticBlock {
	static int i;
	
	StaticBlock() {
		System.out.println("This is a Constructor Block");
	}
	
	static {
		i=101;
		System.out.println("This is a Static Block");
	}

}
