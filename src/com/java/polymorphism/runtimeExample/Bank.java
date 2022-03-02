package com.java.polymorphism.runtimeExample;

public class Bank {
	int interestRate;
	
	public void setInterestRate(int rate) {
		System.out.println("Parent Class");;
		this.interestRate = rate;
	}
	
	public int getInterestRate() {
		return interestRate;
	}

}
