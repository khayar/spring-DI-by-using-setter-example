package com.hello;

public class HelloWorld {

	private String message;
	private Covid19 covid19;

	public HelloWorld() {
		System.out.println("1-Bean constructor called");
	}

	public void setCovid19(Covid19 covid19) {
		this.covid19 = covid19;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void init() {
		System.out.println("3-Bean init method called");
	}

	public void destroy() {
		System.out.println("5-Bean destroy method called");
	}

	public void getTotalCases() {
		covid19.getTotalCases();
	}
}
