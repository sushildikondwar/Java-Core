package com.java.abstraction.interfac;

// 
public interface Shape {
	
	//	INTERFACE CANNOT CONTAIN CONSTRUCTOR
	
	int a=2, b=3;	//	ATTRIBUTES OF JAVA INTERFACE ARE 'PUBLIC', 'STATIC' AND 'FINAL' BY-DEFAULT
	String k = "Sushil";
	
	void draw();	//	METHODS OF JAVA INTERFACE ARE 'PUBLIC' AND 'ABSTRACT' BY-DEFAULT
	
	void area();

}
