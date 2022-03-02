package com.java.polymorphism.runtimeExample;

public class StateBank extends Bank{
	
	int interestRate;
	
	public void setInterestRate(int rate) {
		System.out.println("Child Class");
		this.interestRate = rate;
	}
	
	public int getInterestRate() {
		return interestRate;
	}

}
