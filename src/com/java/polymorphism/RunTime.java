package com.java.polymorphism;

public class RunTime extends Parent{	//	Parent class also have same method
	
	public void abc(int a, String b) {	//	Method got override by child class in run-time
		System.out.println("Child Member");
	}

	public static void main(String[] args) {
		
		RunTime obj = new RunTime();
		obj.abc(101, "Sushi");

	}

}
/*
 * 1> *Do overriding method must have same return type (or sub-type)?
 *     From Java 5.0 onwards, it is possible to have different return type for a overriding method in child class,
 *     BUT CHILD'S RETURN TYPE SHOULD BE SUB-TYPE OF PARENT'S RETURN TYPE, i.e., if parent's return type is OBJECT, then child's return type is STRING
 *     This phenomenon is known as Covariant Return Type
 *     
 * 2> *The access modifier for an overriding method can allow more, BUT NOT LESS ACCESS than the Overridden method, Orelse, will generate compile-time error
 *     Ex: A PROTECTED instance method in the super(PARENT)-class can be made PUBLIC, BUT NOT PRIVATE in the sub(CHILD)-class	*/
