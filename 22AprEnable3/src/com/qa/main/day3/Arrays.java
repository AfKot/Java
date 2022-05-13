package com.qa.main.day3;

import java.util.ArrayList;

public class Arrays {
	
	public static void arraysExample() {
		
		String[] fruitArray = {"kiwi", "melon", "banana", "apple", "melon", "mango"};
		
//		selecting an object from array:		
		System.out.println(fruitArray[0]);
		
		System.out.println("-------");
		
//		check length of array:
		
		System.out.println("The Number of items in this array is: " + fruitArray.length);
		
		for(int i = 0; i < 6; i++) {
			System.out.println(fruitArray[i]);
		}
		
	
		

	}
	
	public static void arraysExercise() {
		
//		Colour Exercise set on call
		
		
		String[] coloursArray = {"Blue", "Red", "Orange", "Purple", "Pink"};
		
		System.out.println("Colours in array: " + coloursArray.length);
		
		for(int i = 0; i < 5; i++)
			if(coloursArray[i] == "Purple") {
				System.out.println(coloursArray[i] + " <-- This is my favourite colour!");
			} else {
				System.out.println(coloursArray[i]);
			}
		System.out.println("Updating colours: " + coloursArray[0] + " " + coloursArray[1]);
		coloursArray[0] = "Green";
		coloursArray[1] = "Gold";
		System.out.println("Colours updated:");
		
		for(int i = 0; i < 5; i++)
			if(coloursArray[i] == "Purple") {
				System.out.println(coloursArray[i] + " <-- This is my favourite colour!");
			} else {
				System.out.println(coloursArray[i]);
		
	}
	
		
		
	}
	
	public static void arrayListDemo() {
		
		ArrayList<String> pizzaList = new ArrayList<>();
		
		System.out.println(pizzaList);
				
		pizzaList.add("Magherita");
		pizzaList.add("Hawaian");
		pizzaList.add("Four Cheese");
		pizzaList.add("BBQ Chicken");
		
		System.out.println(pizzaList);
		
//		TO GET PARTICULAR VALUE .get()
		System.out.println(pizzaList.get(0));
		
//		TO UPDATE VALUES .set()  -- In this case correcting Hawaiian pizza spelling
		pizzaList.set(1, "Hawaiian");
		
//		TO REMOVE A VALUE -- in this case Four Cheese Pizza
		pizzaList.remove(2);
				
//		LENGTH OF AN ARRAYLIST
		System.out.println(pizzaList.size());
		
		System.out.println(pizzaList);
		
//		LOOPS IN ARRAYS -- in this case to get the values within the array
		for(int i = 0; i < pizzaList.size(); i++) {
			System.out.println(pizzaList.get(i));
		}
		
//		ENHANCED LOOP
		for(String pizza : pizzaList) {
			System.out.println(pizza); // THIS PRINTS OUT THE VALUE OF EACH VARIABLE
		}
		
		
//		TO CLEAR A LIST OF ALL VALUES
		pizzaList.clear();
		
		System.out.println(pizzaList);
				
	}
}

