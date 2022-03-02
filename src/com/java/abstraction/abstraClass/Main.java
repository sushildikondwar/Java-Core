package com.java.abstraction.abstraClass;

public class Main {

	public static void main(String[] args) {
		
		Animal.hello();
		
		Dog d = new Dog();
		d.makeSound();	//	abstract method
		d.sleep();	//	non-abstract method
		
		Cat c = new Cat();
		c.makeSound();
		c.sleep(); 

	}

}
