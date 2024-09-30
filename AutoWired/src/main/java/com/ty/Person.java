package com.ty;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private int id;
	private String name;
	@Autowired
	private Car cars;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCars() {
		return cars;
	}
	public void setCars(Car cars) {
		this.cars = cars;
	}
	
	
	

}
