
package com.te.springassignment;

public class Developer implements Company {
	String name;
	Double salary;

	public Developer(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void designation() {
		System.out.println(name + " we are developers and our salary is greater than " + salary);
	}

}
