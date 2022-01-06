package com.te.springassignment;

public class Testers implements Company {
	String name;
	double salary;

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void designation() {
		System.out.println(name + " we are testers and our salary is " + salary);

	}

}
