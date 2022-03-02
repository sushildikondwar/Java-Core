package com.java.constructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Default obj = new Default();
		System.out.println(obj.ConstInfo);
		
		System.out.println();
		
		Parameterized obj1 = new Parameterized(1, 2);
		
		System.out.println();
		
		NonParameterized obj2 = new NonParameterized();
		
		System.out.println();
		
		Copy obj3 = new Copy(4, 9);
		Copy obj4 = new Copy(obj3);

	}

}
