package com.java.polymorphism.runtimeExample;

//	Implementation of UPCASTING results the run-time(late binding) polymorphism

public class Main {

	public static void main(String[] args) {
		
		Bank b = new StateBank();	//	UPCASTING (reference variable of parent class is used as an object of sub-class)
		b.setInterestRate(7);
		System.out.println(b.getInterestRate());

	}

}
