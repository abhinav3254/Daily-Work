package com.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Wish implements InitializingBean,DisposableBean {
	private String message;
	
	public Wish() { System.out.println("Wish Default Constructor created"); }
	
	public Wish(String message) { this.message = message; }
	
	public void setMessage(String message) { this.message = message; }
	
	public String getMessage() {return this.message;}
	
	public void wishDestroy() { System.out.println("Wish is about to destroy"); }
	
	public void wishInit() { System.out.println("Wish Bean is initialized"); }

	@Override
	public void afterPropertiesSet() throws Exception {
		// It is also a InIt method
		System.out.println("From After Properties set method");
	}

	@Override
	public void destroy() throws Exception {
		// This is destroy method
		System.out.println("From Destroy Method Implemented");
	}
}
