package com.qa.main.day4.inheritance;

public class Eagle extends Bird {

	private int eyesight;
	
	public String screech() {
		return "EeeeeHaaaaaaaa";
	}

	public Eagle(String featherColour, String diet, int wingspan, int eyesight) {
		super(featherColour, diet, wingspan);
		this.eyesight = eyesight;
	}
	
	public int getEyesight() {
		return eyesight;
			} 
			
		
}
	
	
	
