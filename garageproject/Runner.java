package com.qa.main.day5.garageproject;

public class Runner {

	public static void main(String[] args) {
		// For Garage Project
		
//		Create all objects
		Garage theMechanic = new Garage();
		
		Car car1 = new Car("Blue", 4, "b", 5, true);
		Truck truck1 = new Truck("Silver", 3, "Siren", true, 6, false);
		
//		adding vehicles to garage:
		theMechanic.addVehicle(truck1);
		theMechanic.addVehicle(car1);
		
		
//		Using the method	
		System.out.println(theMechanic.fixVehicleInGarage(0));
		System.out.println(theMechanic.fixVehicleInGarage(1));

//		Show all vehicles in the garage:
		System.out.println(theMechanic.getAllVehicles());
		
	}

}
