package com.java.abstraction.abstraClass;

// If atleast one abstract method is present in class, therefore, class must be declared with abstract keyword
// abstract class cannot be instantiated
//	JAVA ABSTRACT CLASS CAN HAVE CLASS MEMBERS LIKE PRIVATE, PROTECTED, ETC.
public abstract class Animal {	//	abstract class does not guarantees 100% abstraction
	
	Animal() {	//	abstract class can have a constructor
		System.out.println("New Animal Instantiated..");
	}
		
	abstract void makeSound();	//	abstract method
	
	public void sleep() {	//	non-abstract method
		System.out.println("Zzz..");
	}
	
	static void hello() {	//	static method, will get called only once in the program lifetime
		System.out.println("Hello, its a static method");
	}

}
