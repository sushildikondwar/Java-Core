package com.java.garbageCollector;

public class FinalizeImplicit {
	
	protected void finalize() {
		System.out.println("GARBAGE CLEARED");
	}

	public static void main(String[] args) {
		
		String s = "abcdefghi";	//	STRING IS A 'BUILT-IN' CLASS
		System.out.println(s);
		
		s = null;	//	string object dereferenced
		
		System.gc();	//	UNLIKE THE PREVIOUS EXAMPLE,
					//	GARBAGE COLLECTOR DIDN'T CALLED 'FINALIZE' METHOD
				//	BECAUSE, THE OBJECT WHICH IS DEREFERENCED IS STRING TYPE, AND THE STRING IS A BUILT-IN CLASS,
			//	THEREFORE, BUILT-IN CLASSES CONTAINS IT'S OWN 'FINALIZE' METHODS, SO, THE system.gc() WON'T CALL THE EXPLICITLY PROVIDED 'FINALIZE()' METHOD

	}

}
