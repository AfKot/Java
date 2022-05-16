package com.qa.main.day5.garageproject;

public class Car extends Vehicle {
	
//	Specific Attributes
	private int door;
	private boolean electric;
	
//	Constructor:
	public Car(String colour, int seats, String condition, int door, boolean electric) {
		super(colour, seats, condition);
		this.door = door;
		this.electric = electric;
	}

	@Override
	public float fixVehicle() {
		float fixCost = 200f;
		
		if(electric) {
			fixCost += 750f;
		} else {
			fixCost += 125f;
		}
		
		fixCost = fixCost * door;
		
		if(getCondition() == "a") {
			fixCost -= 125;
		} else if(getCondition() == "b") {
			fixCost += 100;
		} else if(getCondition() == "c") {
			fixCost += 250;
		}
		
		return fixCost;
		
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	@Override
	public String toString() {
		return "Car [doors = " + door + ", electric = " + electric + ", Condition = " + getCondition() + "]";
	}
	
	
	
	
	
	
}
