package com.java.staticblock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( new StaticBlock().i );	//	static block is only called once, when the program first interacts with its class containing static block
		System.out.println( new StaticBlock().i );	//	then, even the class called million times, the static block won't get called
		System.out.println( new StaticBlock().i );


	}

}
