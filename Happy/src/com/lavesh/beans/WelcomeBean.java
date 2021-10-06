package com.lavesh.beans;

public class WelcomeBean {
	
	static {
		System.out.println("****WelcomeBean Class Loading****");
	}
	
	public WelcomeBean() {
		System.out.println("****WelcomeBean Instantiation****");
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
	
	
	public String sayHello() {
		System.out.println("****sayHello() method from WelcomeBean class****");
		return "name "+name+", "+message;
	}

}
