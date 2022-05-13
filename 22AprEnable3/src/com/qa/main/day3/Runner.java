package com.qa.main.day3;

import com.qa.main.day3.objectdemo.Curtains;

public class Runner {
//	    For Arrays
	public static void main(String[] args) {
		
//		Arrays.arraysExample();
//    	Arrays.arraysExercise();
//	    Arrays.arrayListDemo();
		
		Curtains newCurtains1 = new Curtains(true, 85.0f, 55.5f, 5, "Navy" );
		System.out.println(newCurtains1.length);
		System.out.println(newCurtains1.thermal);
		
		Curtains newCurtains2 = new Curtains(true, 105.0f, 60.0f, 10, "Pink" );
		System.out.println(newCurtains2.length);
		System.out.println(newCurtains2.colour);
		
//      UPDATING VALUE
		
		newCurtains2.colour = "Maroon";
		System.out.println(newCurtains2.colour);
		
		
	}

}
