package com.qa.main.day4.abstraction;

public class Pigeon extends Bird {
	
	private String town;

	public Pigeon(int wingspan, String featherColour, String town) {
		super(wingspan, featherColour);
		this.town = town;
	}

	@Override
	public String layEgg() {
		return "Double check your balconies!";
	}

	@Override
	public String eat(String diet) {
		return "Pigeon diet: " + diet;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}
	
	
	

}
