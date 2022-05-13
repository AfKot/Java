package com.qa.main.day5.garageproject;

import java.util.ArrayList;

public class Garage {
	
// Garage charge to fix objects/Vehicles:
	
	public float garageCost;
	
// need: Add, Remove, Get and Fix from list
	
	public ArrayList<Vehicle> garageFix = new ArrayList<>();
	
	public boolean addVehicle(Vehicle vehicle) {
		return garageFix.add(vehicle);
	}
	
	public Vehicle delVehicle(int i) {
		return garageFix.remove(i);
	}
	
	public Vehicle getVehicle(int i) {
		return garageFix.get(i);
	}
	
	public
	
	
}
