package com.qa.main.day5.garageproject;

public class Truck extends Vehicle {
	
	private boolean trailer;
	private int door;
	private boolean electric;

//Constructor:
	public Truck(String colour, int seats, String sound, boolean trailer, int door, boolean electric) {
		super(colour, seats, sound);
		this.trailer = trailer;
		this.door = door;
		this.electric = electric;
	}


	@Override
	public float fixVehicle() {
		float fixCost = 300f;
		if(electric) {
			fixCost += 1000f;
		} else {
			fixCost += 425f;
		}
		
		if(trailer) {
			fixCost += 1200f; 
		}
		if(!trailer) {
			fixCost += 0f;
		}
		
		if(getCondition() == "a") {
			fixCost -= 150;
		} else if(getCondition() == "b") {
			fixCost += 550;
		} else if(getCondition() == "c") {
			fixCost += 1150;
		}
		
		fixCost = fixCost += door*50; 
		
		return fixCost;
	}


	public boolean isTrailer() {
		return trailer;
	}


	public void setTrailer(boolean trailer) {
		this.trailer = trailer;
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
		return "Truck [trailer = " + trailer + ", doors = " + door + ", electric = " + electric + ", Condition = "
				+ getCondition() + "]";
	}

	

	
	
}

