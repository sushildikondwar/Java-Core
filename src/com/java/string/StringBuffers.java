package com.java.string;

//	STRING-BUFFER CLASS IS MUTABLE, THEREFORE IT'S BEST TO PERFORM CONCATENATION OPERATION

// STRING-BUFFER CLASS IS 'FAST AND CONSUMES LESS MEMORY' AS COMPARED TO STRING CLASS,
// BECAUSE, IT IS UNLIKE THE STRING, WHERE EVERYTIME THE NEW MEMORY WAS GETTING CREATED, WHEN TRIED TO MANIPULATE THE STRING DATA

public class StringBuffers {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("This is Java");	//	as we are using new keyword, the object space will form in Heap Memory
		
		System.out.println("Original String: " + str);
		
		str.append(" Programming Language");	//	MUTATING PRE-EXISTING STRING
		System.out.println("Mutated String: " + str);
		
		// STRING-BUFFER METHODS..
		
		System.out.println("19th character: " + str.charAt(19));
		
	}

}
//	SIMILAR IS THE *STRINGBUILDER* CLASS, WHICH IS SIMILAR TO THE STRINGBUFFER EXCEPT ONE FEATURE, I.E., STRINGBUILDER DOESN'T PROVIDE GUARANTEE OF SYNCHRONIZATION
