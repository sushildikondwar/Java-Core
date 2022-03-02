package com.java.inheritance.multilevel;

public class Main {

	public static void main(String[] args) {
		
		Puppy p = new Puppy();
		p.bark();	//	inherited from DOG(parent)
		p.eat();	//	inherited from ANIMAL(ancestor)
		p.weep();

	}

}
