package com.te.beanconfigurations.beanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.te.beanconfigurations.Dog;
import com.te.beanconfigurations.Pet;
import com.te.beanconfigurations.Praveen;
import com.te.beanconfigurations.Yashwanth;

public class Config {
	@Bean("Dog")
	@Primary
	public Dog getDog() {
		return new Dog();
	}

	@Bean
	
	public Praveen getPraveen() {
		return new Praveen();
	}

	@Bean
	public Yashwanth getYashwanth() {
		return new Yashwanth();

	}

	@Bean
	public Pet getPet() {
//		Pet pet = new Pet();
//		pet.setAnimals(getPraveen());
		return new Pet();

	}
}
