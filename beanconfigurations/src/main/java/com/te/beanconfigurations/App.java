package com.te.beanconfigurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.beanconfigurations.beanconfig.Config;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        Pet pet = container.getBean(Pet.class);
        pet.doThings();
    }
}
