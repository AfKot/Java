package com.qa.main.day2;

public class Loops {

	public static void exampleIteration() {
		
		int counter = 0;
		
		System.out.println("Before Loop");
		
		while(counter < 10){
			counter += 1;
			System.out.println("Counter: " + counter);
			
		}
		System.out.println("-----Loop Complete-----");
	}
	
	public static void expensesExercise(float starting, float expenses, float limit) {
		
		while(starting > limit) {
			
		}
	}
	
	public static void doWhile() {
		
	}
	
//	For Loops
	
	public static void forCountingLoop() {
//		Simple counting for Loop
		for(int i = 0; i <= 10; i++) {
			System.out.println("Stopwatch: " + i);
		}
		
//		Simple count down for loop
		for(int x = 10; x >= 1; x--) {
			System.out.println("Timer: " + x);
		}
		
//		one more step added
		
		for(int z = 2; z <= 15; z += 2) {
			if(z == 6) {
				System.out.println("z is now equal to 6");
			} else {
				System.out.println(z);
			}
		}
	}

	
	public static void flowchartExercise() {
		
		for(int a = 100; a < 200; a++) {
			System.out.println(a);
			
			if(a >= 200) {
			   	System.out.println("Process complete. 'a' is greater than 200.");
			}
				
		}
		
	}

	public static void flowchartExercise2() {
		
		for(int a = 100; a <= 200 ; a++) {
			if(a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	public static void flowchartExercise3() {
		
//Create a method that can print out the numbers 1-10 10 times each.
	
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(j);
				
			}
			System.out.println("internal loop finished");
		}
		System.out.println("After Loop");
	
	
	}
	
	public static void flowchartExercise4() {
	
//If you have used a while()-loop at any point in these exercises, replace them with for()-loops. 
//Remember you should use a for()-loop when you know when the iteration should end.
		
		for(int i = 1; i <= 10; i++) {
			for(int x = 1; x <= i; x++) {
				System.out.println(i);
			}
	
		}
	}

}
