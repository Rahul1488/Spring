package com.te.beanlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		//ConfigurableApplicationContext container = new AnnotationConfigApplicationContext(BeanConfig.class);
		AbstractApplicationContext container = new AnnotationConfigApplicationContext(BeanConfig.class);
		Demo bean = (Demo) container.getBean("demo");
		container.registerShutdownHook();
		bean.name();
		//container.close();
		System.out.println(bean.hashCode());
	}
}
