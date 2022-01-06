package com.te.springs;

public class Car {
	Garage e;
	String name;

//	public Car(Garage e, String name) {
//		System.out.println("Car object created");
//		this.e = e;
//		this.name = name;
//	}

	public void setE(Garage e) {
		this.e = e;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move() {
		e.start();
		System.out.println(name + "car is moving");
	}

}
