package com.qa.main.day4.abstraction;

public class Flamingo extends Bird {

	private float height;
	
//	Constructor:

	public Flamingo(int wingspan, String featherColour, float height) {
		super(wingspan, featherColour);
		this.height = height;
	}

    @Override
    public String layEgg() {
    	return "Mind the drop!!";
    	}

    @Override
    public String eat(String diet) {
    	return "Flamingo diet: " + diet ;
    	}

	public String getHeight() {
		return height + "m";
	}

	public void setHeight(float height) {
		this.height = height;
	}
    
	
	
}
