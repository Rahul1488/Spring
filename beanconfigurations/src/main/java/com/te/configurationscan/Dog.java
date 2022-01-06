package com.te.configurationscan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animals{
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
