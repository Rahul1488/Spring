package com.te.springs;

public class Engine implements Garage {
	String name;
	double capacity;

//	public Engine(String name, double capacity) {
//		super();
//		this.name = name;
//		this.capacity = capacity;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public void start() {
		System.out.println(name + " Engine has started and has capacity of :" + capacity);
	}
}
