package com.springcore.lifecycle;

public class Samosa {

	private Double price;

	public Samosa(Double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		System.out.println("setting price ");
		this.price = price;
	}
	public void init() {
		System.out.println("Inside init Method");
	}
	public void destroy() {
		System.out.println("Inside destroy Method");
	}
}
