package com.qa.main.day4.oopRecap;

public class Sandwiches {

	public String name;
	public int calories;
	public float price;
	public boolean vegetarian;
	
	
	public Sandwiches(String name, int calories, float price, boolean vegetarian) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return "Sandwiches [name=" + name + ", calories=" + calories + ", price=" + price + ", vegetarian=" + vegetarian
				+ "]";
	}
	
	
	
	
	
}
