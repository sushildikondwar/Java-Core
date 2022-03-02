package com.java.loop;

public class WhileLoop {
	public void runLoop() {
		System.out.println("*Running While Loop");
		int i=1;
		while (i <= 10) {
			System.out.print(i*i*i + " ");
			i++;
		}
	}
}
