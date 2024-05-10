package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

public class Student {
	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		samosa.display();
		System.out.println("student is studing");
	}
}
