package com.te.beanconfigurations;

import org.springframework.beans.factory.annotation.Autowired;

public class Pet {
	String name;
	@Autowired
	Animals animals;

	public void doThings() {
		if (animals.ispet()) {
			animals.eat();
			animals.makesound();
		} else {
			System.out.println("This is not a pet");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animals getAnimals() {
		return animals;
	}

	public void setAnimals(Animals animals) {
		this.animals = animals;
	}

	
}
