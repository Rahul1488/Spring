package com.te.configurationscan;

import org.springframework.stereotype.Component;

@Component
public class Yashwanth implements Animals{
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
