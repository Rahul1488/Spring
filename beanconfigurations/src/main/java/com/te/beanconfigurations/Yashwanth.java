package com.te.beanconfigurations;

public class Yashwanth implements Animals {

	@Override
	public void makesound() {
		System.out.println("bow");
	}

	@Override
	public void eat() {
		System.out.println("food");

	}

	@Override
	public boolean ispet() {

		return false;
	}

}
