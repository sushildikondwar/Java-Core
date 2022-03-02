package com.java.constructor;

public class Chaining {
	
	String name; int age;
	
	Chaining(String name) {
		this(name, 22);
	}
	
	Chaining(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("Name: "+name+"\nAge: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chaining c = new Chaining("Sushil");
		c.showInfo();

	}

}
