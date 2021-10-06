package com.lavesh.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lavesh.beans.WelcomeBean;
import com.lavesh.beans.WelcomeBean1;
import com.lavesh.beans.WelcomeBean2;
import com.lavesh.beans.WelcomeBean3;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/lavesh/resources/applicationContext.xml");
		WelcomeBean welcome = (WelcomeBean) context.getBean("id1");
		System.out.println(welcome.sayHello());;
		
		
		WelcomeBean1 welcome1 = (WelcomeBean1) context.getBean("id2");
		System.out.println(welcome1.sayHello());
		
		WelcomeBean2 welcome2 = (WelcomeBean2) context.getBean("id3");
		System.out.println(welcome2.sayHello());
		
		WelcomeBean3 welcome3 = (WelcomeBean3) context.getBean("id4");
		System.out.println(welcome3.sayHello());
		
		context.registerShutdownHook();
	}

}
