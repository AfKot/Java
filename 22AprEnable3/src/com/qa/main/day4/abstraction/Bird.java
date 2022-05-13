package com.qa.main.day4.abstraction;

// THIS IS OUR ABSTRACT CLASS
// WE CANT CREATE AN OBJECT 'BIRD' DIRECTLY

public abstract class Bird {

	private int wingspan;
	private String featherColour;
	
	
	public Bird(int wingspan, String featherColour) {
		super();
		this.wingspan = wingspan;
		this.featherColour = featherColour;
	}
	
// METHODS - ABSTRACT CLASSES CAN USE ABSTRACT METHODS
// THESE METHODS HAVE NO BODY AKA {} - SO THE CHILDREN CAN MAKE THE METHOD DO WHAT THEY WANT
// EACH CHILD HAS THE SAME METHOD WHICH RETURNS THE SAME DATA
	
// ABSTRACT METHOD FOR layEgg() - ALL CHILDREN MUST DEFINE WHAT THIS METHOD DOES
	
	public abstract String layEgg();
	
	public abstract String eat(String diet);

	
//	Getters and setters:
	
	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public String getFeatherColour() {
		return featherColour;
	}

	public void setFeatherColour(String featherColour) {
		this.featherColour = featherColour;
	}
	
	
	
}
