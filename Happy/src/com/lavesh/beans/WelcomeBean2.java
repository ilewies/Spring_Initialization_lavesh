package com.lavesh.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class WelcomeBean2 implements InitializingBean, DisposableBean{
	
	static {
		System.out.println("****WelcomeBean2 Class Loading****");
	}
	
	public WelcomeBean2() {
		System.out.println("****WelcomeBean2 Instantiation****");
	}
	
	
	private String name;
	private String message;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("****destroy() from WelcomeBean2 Class****");
		name="";
		message="";
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("****afterPropertiesSet() from WelcomeBean2 Class****");
		name = "Tanu";
		message=" hii good night";
		
	}
	
	public String sayHello() {
		System.out.println("****sayHello() method from WelcomeBean2 class****");
		return "name "+name+", "+message;
	}
	

}
