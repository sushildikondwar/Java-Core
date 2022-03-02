package com.java.method;

/**
 * It is necessary to create an object of its class, to access the Instance Method, orelse, if tried to access without Initialization, error will be encountered
 * Can call/access both Static and Non-static members	*/

public class Instance {
	
	int x = 999999999;
	
	public void InstanceMeth(int cnt) {
		for (int i=0; i<cnt; i++)
			System.out.println("This is a Instance Method" + this.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance meth = new Instance();
		meth.InstanceMeth(5);
	
	}

}
