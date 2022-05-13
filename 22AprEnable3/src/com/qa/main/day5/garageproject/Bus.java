package com.qa.main.day5.garageproject;

public class Bus extends Vehicle implements HasDoors, HasEngine, HasWheels, HasWindows {
	
	private int floors;

	public Bus(String colour, int seats, String sound, int floors) {
		super(colour, seats, sound);
		this.floors = floors;
	}

	@Override
	public int hasWheels() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasEngine() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hasDoors() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float fixVehicle() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
