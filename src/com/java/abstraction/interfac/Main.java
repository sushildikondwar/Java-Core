package com.java.abstraction.interfac;

public class Main {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(10, 15);
		r.draw();
		r.area();
		
		Circle c = new Circle(24);
		c.draw();
		c.area();

	}

}
