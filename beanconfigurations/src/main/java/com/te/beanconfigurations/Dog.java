package com.te.beanconfigurations;

public class Dog implements Animals {

	@Override
	public void makesound() {
		System.out.println("Baaw Baaw");

	}

	@Override
	public void eat() {
		System.out.println("pedigree and mosranna");

	}

	@Override
	public boolean ispet() {

		return true;
	}

}
