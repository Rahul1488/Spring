package com.te.configurationscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.te.configurationscan.beanconfig.Config;
import com.te.configurationscan.test.Demo;

public class App {
	  public static void main( String[] args )
	    {
	        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
	        Pet pet = container.getBean(Pet.class);
	        pet.doThings();
	        Demo bean = container.getBean(Demo.class);
	        System.out.println(bean);
	        
	    }
}
