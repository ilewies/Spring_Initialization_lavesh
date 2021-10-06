package com.lavesh.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class WelcomeBean3 {
	
	static {
		System.out.println("****WelcomeBean3 Class Loading****");
	}
	
	public WelcomeBean3() {
		System.out.println("****WelcomeBean3 Instantiation****");
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
	
	@PostConstruct
	public void BeanInit() {
		name = "kunu";
		message = "Hii how are you?";
	}
	
	@PreDestroy
	public void BeanDestroy() {
		System.out.println("****destroy() from WelcomeBean3 Class****");
		name="";
		message="";
	}
	
	public String sayHello() {
		System.out.println("****sayHello() method from WelcomeBean3 class****");
		return "name "+name+", "+message;
	}
	
	

}
