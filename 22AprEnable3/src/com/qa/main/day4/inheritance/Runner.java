package com.qa.main.day4.inheritance;

public class Runner {
	
	public static void main(String[] args) {
		
		Penguin chicken = new Penguin("Brown", "Fish", 12, 13);
		System.out.println(chicken.swim());
		System.out.println(chicken.getFeatherColour());
		System.out.println(chicken.getFishEaten());
		
		
		Eagle charlie = new Eagle("Black", "Mice", 35, 8);
		System.out.println(charlie.screech());
		System.out.println(charlie.getFeatherColour());
		System.out.println(charlie.getEyesight());
		
		Eagle kyle = new Eagle("White", "Mice", 37, 9);
		
		
	}

}
