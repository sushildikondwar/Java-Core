package com.java.exception;

public class ThrowThrowsException {
	
	public static int areaRectangle(int a, int b) throws CustomNegativeSideException {	//	CALLING CUSTOM EXCEPTION
		if (a<0 || b<0) {
			throw new CustomNegativeSideException();
		}
		int c = a*b;
		return c;
	}

	public static void main(String[] args) {
		
		try {
			int ans = areaRectangle(425, -698);
			System.out.println(ans);			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			int ans = areaRectangle(425, 698);
			System.out.println(ans);			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
