package com.qa.main.day5.garageproject;

public class Truck extends Vehicle {
	
	private boolean trailer;

	public Truck(String colour, int seats, String sound, boolean trailer) {
		super(colour, seats, sound);
		this.trailer = trailer;
	}

	@Override
	public float fixVehicle() {
		float fixVehicle = 0;
		if(trailer) {
			fixVehicle += 500; 
		}
		if(!trailer) {
			fixVehicle += 0;
		}
		return fixVehicle;
	}


	
	
}

