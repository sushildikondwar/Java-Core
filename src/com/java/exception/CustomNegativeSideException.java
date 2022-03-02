package com.java.exception;

//	CREATING CUSTOM EXCEPTION

public class CustomNegativeSideException extends Exception{
	
	@Override
	public String toString() {
		return "Side Cannot be Negative!";
	}
	
	@Override
	public String getMessage() {
		return "Side Cannot be Negative!";
	}

}
