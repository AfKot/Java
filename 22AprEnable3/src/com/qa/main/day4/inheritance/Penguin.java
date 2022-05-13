package com.qa.main.day4.inheritance;

public class Penguin extends Bird {

	private int fishEaten;
	
	public String swim() {
		return "Swimmer Swimmer Penguin Dinner";
	}

	public Penguin(String featherColour, String diet, int wingspan, int fishEaten) {
//		Super refers to the parent class which in this case is Bird
		super(featherColour, diet, wingspan);
		this.fishEaten = fishEaten;
	}
	
	public int getFishEaten() {
		return fishEaten;
	}
	
	
}
