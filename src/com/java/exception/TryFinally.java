package com.java.exception;

public class TryFinally {
	
	void experiments() {	//	THIS FUNCTION IS INACTIVE, ACTIVATE IT IN MAIN METHOD
		try {
			int a=11, b=12;
			int c = a/b;	//	here, exception will not occur, so vaisebhi catch block ki zarurat nahi padi, then the flow will run smoothly
		}
		finally {
			System.out.println("Finally Block!..");
		}
	}
	
	void experiments2() {
		try { 
			int a=234, b=0;	//	but here, jaisehi try block 234/0 ka exception throw karega, flow will search for catch block,
			int c = a/b; 
		}	//	but catch block is absent, therefore, *the program will print finally block first*, *then it'll terminate unexpectedly showing an ArithmeticException*
		finally {
			System.out.println("Finally Block!");
		}
	}
	

	public static void main(String[] args) {
		
		TryFinally x = new TryFinally();
//		x.experiments();
		x.experiments2();

	}

}
