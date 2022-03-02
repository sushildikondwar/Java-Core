package com.java.inheritance.hierarchical;

public class Main {

	public static void main(String[] args) {
		
		Dog d = new Dog();		
		d.eat();	//	inherited from ancestors
		d.bark();
		
		System.out.println("----------------");
		
		Cat c = new Cat();
		c.eat();	//	inherited from ancestors
		d.bark();

	}

}
