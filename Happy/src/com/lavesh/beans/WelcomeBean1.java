package com.lavesh.beans;

public class WelcomeBean1 {
	
	static {
		System.out.println("****WelcomeBean1 Class Loading****");
	}
	
	public WelcomeBean1() {
		System.out.println("****WelcomeBean1 Instantiation****");
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
		System.out.println("****sayHello() method from WelcomeBean1 class****");
		return "name "+name+", "+message;
	}
	
	public void init() {
		System.out.println("****init() from WelcomeBean1 Class****");
		name="Tony";
		message="goood afternoon";
	}
	public void destroy() {
		System.out.println("****destroy() from WelcomeBean1 Class****");
		name = "";
		message ="";
	}

}
