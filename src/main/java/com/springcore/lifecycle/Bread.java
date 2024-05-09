package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bread {

	private String name;

	@Override
	public String toString() {
		return "Bread [name=" + name + "]";
	}

	public Bread(String name) {
		super();
		this.name = name;
	}

	public Bread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
		
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
		
	}
	
	 
}
