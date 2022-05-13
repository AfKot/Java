package com.qa.main.day5.garageproject;

public class Boat extends Vehicle {
	
//	Fields:
	private int sails;
	private int lifeJackets;
	
//	Constructor:
	public Boat(String colour, int seats, String sound, int sails, int lifeJackets) {
		super(colour, seats, sound);
		this.sails = sails;
		this.lifeJackets = lifeJackets;
	}

@Override
public float fixVehicle() {
	// TODO Auto-generated method stub
	return 0;
}

	
	

}
