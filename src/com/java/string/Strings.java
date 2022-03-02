package com.java.string;

//	STRING IS IMMUTABLE

public class Strings {

	public static void main(String[] args) {
		
		String str = "  I am Sushil Dikondwar  ";
//		str = str+"08051999";	//	we have to do this explicitly because of immutable character of string. The new space gets created when added string to str.
		
		System.out.println("index of character 'm' :" + str.indexOf('m'));
		
		System.out.println("starting index of 'dikondwar' : " + str.indexOf("Dikondwar"));
		
		System.out.println("replacing 'Sushil' --> 'Akash' : " + str.replace("Sushil", "Akash"));	//	this will not change the original string, as the string object is immutable
		System.out.println(str);
		
		String afterTrim = str.trim();
		System.out.println("Original String: " + str);
		System.out.println("After Trim: " + afterTrim);
		
		System.out.println("Substring of an Original String: " + str.substring(9, 19));
		
		System.out.println("Length of String: " + str.length());
		
		

	}

}
