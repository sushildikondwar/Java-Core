package com.java.hello;

public class Hello {
	private String welcome;
	
	public void setter(String msg) {
		this.welcome = msg;
	}
	
	public void getter() {
		System.out.println(this.welcome);
	}

}
