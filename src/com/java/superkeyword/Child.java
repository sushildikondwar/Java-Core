package com.java.superkeyword;

//	CONSTRUCTOR CAN BE CALLED ONLY ONCE USING SUPER KEYWORD

//	SUPER KEYWORD CAN ONLY AND ONLY BE USED IN THE CHILD CLASS, TO ACCESS THE MEMBERS OF ITS PARENT CLASS

public class Child extends Parent{
	
	Child() {
		super();	//	PARENT CONSTRUCTOR CAN ONLY BE CALLED INSIDE CHILD CONSTRUCTOR (should be call before all operations, i.e., should be the first statement in constructor)
		System.out.println("I am a Child Constructor");
	}
	
	String s = "Child";
		
	public void method() {
		System.out.println(super.s + " is a String attribute from parent fetched using super keyword");
		System.out.println("This is a Child Method");
	}
	public void fetchParentMethod() {
		super.method();
	}

}
