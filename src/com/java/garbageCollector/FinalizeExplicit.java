package com.java.garbageCollector;

public class FinalizeExplicit {
	
	public void method() {
		System.out.println("Hello World!");
	}
	
	//	FINALIZE SHOULD ALWAYS BE PROTECTED
	
	protected void finalize() {	//	FINALIZE() METHOD IS CALLED BY GARBAGE COLLECTION THREAD BEFORE COLLECTING THE OBJECT
		System.out.println("GARBAGE COLLECTION IN-PROCESS..");
	}

	public static void main(String[] args) {
		
		FinalizeExplicit obj = new FinalizeExplicit();	//	object initialized and referenced
		obj.method();
		
		obj = null;	//	object dereferenced, but, obj memory is still there in heap
		
		// now, we call the garbage collector,
		System.gc();	//	this will clean up all the dereferenced or null-referenced objects and call the 'finalize()'
		
		// now, if we try to call the method using object
//		obj.method();	//	this will throw an error
		System.out.println("GARBAGE COLLECTED!");

	}
	

}

