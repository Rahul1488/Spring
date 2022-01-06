package com.te.springannotationsmixed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
	Employee bean = container.getBean(Employee.class);
	System.out.println(bean);
}
}
