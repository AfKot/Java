package com.qa.main.day4.oopRecap;

//This class is o create drinks for our cafe
public class Drink {

//	variables first
	
	public String type;
	public float cost;
	public boolean dairyFree;
	public int calories;
	
//	The constructor - method/way to create the object
//	Way to do this automatically = Shift + Alt + s then select Generate constructor (USE THIS - prevents human error)
	
	public Drink(String type, float cost, boolean dairyFree, int calories) {
		super();  // super(); tells Java we want to create this in the default way
		this.type = type;
		this.cost = cost;
		this.dairyFree = dairyFree;
		this.calories = calories;
	}
	
	// toString - when we want to get a system out that gives us values as oppose to the location reference.
//	 this needs to be done when defining the object so that it can be called in the format required in the Runner

	@Override
	public String toString() {
		return "Drink [type=" + type + ", cost=" + cost + ", dairyFree=" + dairyFree + ", calories=" + calories + "]";
	}
	
	
	
}
