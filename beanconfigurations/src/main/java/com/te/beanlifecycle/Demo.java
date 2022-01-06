package com.te.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Demo implements InitializingBean, DisposableBean {
	public Demo() {
		System.out.println("the bean is instantiated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From set properties");

	}

	public void name() {
		System.out.println("After setting the properties");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying the bean");
	}

}
