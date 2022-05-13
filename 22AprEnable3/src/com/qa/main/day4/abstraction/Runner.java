package com.qa.main.day4.abstraction;

public class Runner {

	public static void main(String[] args) {
		
		Eagle johnny = new Eagle(65, "Black", 8, "Screech");
		Pigeon dave = new Pigeon(12, "Grey", "London");
		Flamingo freddy = new Flamingo(24, "Pink", 1.50f);
		
		
		System.out.println(freddy.eat("Fish"));
		System.out.println(freddy.getHeight());
		
		System.out.println(johnny.layEgg());
		System.out.println(johnny.getSound());
		
		System.out.println(dave.getFeatherColour());
		System.out.println(dave.getTown());
		
		
		

	}

}
