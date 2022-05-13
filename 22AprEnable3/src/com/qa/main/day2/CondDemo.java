package com.qa.main.day2;

public class CondDemo {

	public static void basicEx() {
		
		boolean kettleOn = true;
		int waterTemp = 50;
		
		if(waterTemp > 95) {
			kettleOn = false;
			System.out.println("The Kettle is off!");
		} else 
			System.out.println("The Kettle isn't ready!");
	}
	
	public static void nestingIfElse() {
		
		boolean tails = false;
		
		if(tails == true) {
			System.out.println("It's Tails!");
		} else {
			System.out.println("It's Heads!");
		}
	
	
	}
	
	public static void complexIfElse() {
		
		int num = 7;
		String colour = "Red";
		
//		Checking two statements at once
//		&& - check both are
//		¦¦ - or operator (checks either or both are)
		
//		checking if number if greater than 8 AND colour is red
		
		if(num > 8 && colour == "Red") {
			System.out.println("Num greater than 8 and Colour is Red");			
		} else if (num > 8) {
			System.out.println("Num is greater than 8 but Colour is not Red");
		} else if (colour == "Red") {
			System.out.println("Number isn't greater than 8 but Colour is Red");
		} else {
			System.out.println("Number isn't greater than 8 and Colour is not Red");
		}
		
	}
	

}
	
	

