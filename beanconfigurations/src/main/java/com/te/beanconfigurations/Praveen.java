package com.te.beanconfigurations;

public class Praveen implements Animals {

	@Override
	public void makesound() {
		System.out.println("ghrrrrr");
		
	}

	@Override
	public void eat() {
		System.out.println("everything");
		
	}

	@Override
	public boolean ispet() {
		return false;
	}

}
