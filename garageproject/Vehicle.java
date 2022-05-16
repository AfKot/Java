package com.qa.main.day5.garageproject;

public abstract class Vehicle {

//	Fields:
	private String colour;
	private int seats;
	private String condition;
	
//	Constructor: 
	public Vehicle(String colour, int seats, String sound) {
		super();
		this.colour = colour;
		this.seats = seats;
		this.condition = sound;
	}
	
//	Abstract method
	public abstract float fixVehicle();
	
//	Getters and Setters:

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	


	

	
	
	
	
	
	

}
