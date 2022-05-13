package com.qa.main.day5.garageproject;

public abstract class Vehicle {

//	Fields:
	private String colour;
	private int seats;
	private String sound;
	
//	Constructor: 
	public Vehicle(String colour, int seats, String sound) {
		super();
		this.colour = colour;
		this.seats = seats;
		this.sound = sound;
	}
	
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

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	
	
	
	
	
	

}
