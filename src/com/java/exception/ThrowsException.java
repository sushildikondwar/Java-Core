package com.java.exception;

public class ThrowsException {
	
	public static int divide(int a, int b) throws ArithmeticException{
//	HERE, THE FUNCTION IS REQUIRED TO RETURN AN INTEGER VALUE, BUT, IF DIVIDED BY ZERO, THEN HOW IT CAN RETURN ANY VALUE.
//	THAT'S WHY, THE 'THROWS' CAME INTO PICTURE, IF ANYWHERE IN THE FUNCTION, THE ERROR OCCURS, THEN THE FUNCTION FLOW SHOULD STOP AND THROWS AN ERROR		
		int c = a/b;
		return c;
	}

	public static void main(String[] args) {
		
//	WHEN ANY FUNCTION IS DECLARED AS 'THROWS', IT BECOMES MANDATORY TO HANDLE THAT THROWED ERROR, THATS WHY, THAT FUNCTION SHOULD BE CALLED UNDER THE TRY BLOCK		
		try {
			System.out.println(divide(15, 0));			
		}
		catch (Exception e) {
			System.out.println("Cannot divide by Zero");
		}

	}

}
