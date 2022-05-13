package com.qa.main.day5.garageproject;

public class Bus extends Vehicle  {
	
	private int floors;

	public Bus(String colour, int seats, String sound, int floors) {
		super(colour, seats, sound);
		this.floors = floors;
	}

	@Override
	public float fixVehicle() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
