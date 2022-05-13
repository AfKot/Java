package com.qa.main.day4.abstraction;

public class Eagle extends Bird {
	
	private int eyesight;
	private String sound;

	public Eagle(int wingspan, String featherColour, int eyesight, String sound) {
		super(wingspan, featherColour);
		this.eyesight = eyesight;
		this.sound = sound;
	}

	@Override
	public String layEgg() {
		return "Don't fry these, you'll anger the Americans!";
	}

	@Override
	public String eat(String diet) {
		return "Eagle diet: " + diet;
	}

	public int getEyesight() {
		return eyesight;
	}

	public void setEyesight(int eyesight) {
		this.eyesight = eyesight;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	

}
