package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
 private double price;

public Pepsi(double price) {
	super();
	this.price = price;
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Inside init taking pepsi");
	// TODO Auto-generated method stub
	
}

@Override
public void destroy() throws Exception {
	System.out.println("Inside destroy pepsi is empty");
	// TODO Auto-generated method stub
	
}
 
}
