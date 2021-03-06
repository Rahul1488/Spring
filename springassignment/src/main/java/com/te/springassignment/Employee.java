package com.te.springassignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
	public static void main(String[] args) {
		AbstractApplicationContext container = new ClassPathXmlApplicationContext("configure.xml");
		Developer bean = container.getBean(Developer.class);
		bean.designation();
		Testers bean2 = container.getBean(Testers.class);
		bean2.designation();
	}
}
