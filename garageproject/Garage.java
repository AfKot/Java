package com.qa.main.day5.garageproject;

import java.util.ArrayList;

//THIS IS WHERE ALL THE METHODS WILL BE

public class Garage {
	
//	Array List to store data:
	
	public ArrayList<Vehicle> garageList = new ArrayList<>();

	
// need: Add, Remove, Get Vehicle, Get all Vehicles and Fix from list
	
	
	public boolean addVehicle(Vehicle vehicle) {
		garageList.add(vehicle);
		return true;
	}
	
//	To remove: it takes in our index number as an integer
	public Vehicle delVehicle(int index) {
		return garageList.remove(index);
	}
	
	public Vehicle getVehicle(int index) {
		return garageList.get(index);
	}
	
	public float fixVehicleInGarage(int index) {
		Vehicle vehicleToFix = getVehicle(index);
		return vehicleToFix.fixVehicle();
	}
	
	public ArrayList<Vehicle> getAllVehicles() {
		return garageList;
	}
	
	
	
	
}
