package com.te.springs;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("config2.xml");
		Engine bean = container.getBean(Engine.class);
		bean.start();
		Car bean2 = container.getBean(Car.class);
		bean2.move();
	}
}
