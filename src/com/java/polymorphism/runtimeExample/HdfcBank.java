package com.java.polymorphism.runtimeExample;

public class HdfcBank extends Bank{
	
	int interestRate;
	
	public void setInterestRate(int rate) {
		this.interestRate = rate;
	}
	
	public int getInterestRate() {
		return interestRate;
	}

}
