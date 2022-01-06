package com.te.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//this is for setter methods in spring and there is anothe class demo

public class Test {
public static void main(String[] args) {
	ApplicationContext container = new  ClassPathXmlApplicationContext("config2.xml");
	Demo bean = container.getBean(Demo.class);
	System.out.println(bean);
	Demo bean2 = container.getBean(Demo.class);
	System.out.println(bean2);
	Demo bean3 = container.getBean(Demo.class);
	System.out.println(bean3);
}
}
