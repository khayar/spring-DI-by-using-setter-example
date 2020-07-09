package com.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getTotalCases();

		context.registerShutdownHook();
	}

}
