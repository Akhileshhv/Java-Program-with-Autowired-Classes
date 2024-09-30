package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	
	Person person=(Person)context.getBean("myperson");
	
	System.out.println("Person id is "+person.getId());
	System.out.println("Person name is "+person.getName());
	System.out.println("Person car brand is "+person.getCars().getBrand());
	System.out.println("Person car cost is "+person.getCars().getCost());
	
}
	
}
