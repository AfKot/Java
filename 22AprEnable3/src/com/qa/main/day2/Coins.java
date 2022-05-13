package com.qa.main.day2;

public class Coins {
	
	public static void coinsExercise(float cost, float paid) {
			
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int two = 0;
		int one = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		float change = paid - cost;
				
		System.out.printf("Total Change: £" + "%.2f%n", change);
		
		while(change >= 50f) {
			fifty++;  // add one fifty pound note
			change -= 50f; // subtract 50 from change total
		}
		
		while(change >= 20f) {
			twenty++;
			change -= 20f;
		}
		
		while(change >= 10f) {
			ten++;
			change -= 10f;
		}
		
		while(change >= 5f) {
			five++;
			change -= 5f;
		}
		
		while(change >= 2f) {
			two++;
			change -= 2f;
		}
				
		while(change >= 1f) {
			one++;
			change -= 1f;
		}
		
		while(change >= 0.5f) {
			fiftyPence++;
			change -= 0.5f;
		}
		
		while(change >= 0.2f) {
			twentyPence++;
			change -= 0.2f;
		}
		
		while(change >= 0.1f) {
			tenPence++;
			change -= 0.1f;
		}
		
		while(change >= 0.05f) {
			fivePence++;
			change -= 0.05f;
		}
		
		while(change >= 0.02f) {
			twoPence++;
			change -= 0.02f;
		}
		
		while(change >= 0.01f) {
			onePence++;
			change -= 0.01f;
		}
		
				
		if(fifty > 0) {
			System.out.println("£50 Notes: " + fifty);
		}
			
		if(twenty > 0) {
			System.out.println("£20 Pound Notes: " + twenty);
		}
		if(ten > 0) {
			System.out.println("£10 Pound Notes: " + ten);
		}
		
		if(five > 0) {
			System.out.println("£5 Pound Notes: " + five);
		}
		
		if(two > 0) {
			System.out.println("£2 Pound Coins: " + two);
		}
		
		if(one > 0) {
			System.out.println("£1 Pound Coins: " + one);
		}
		
		if(fiftyPence > 0) {
			System.out.println("50p Coins: " + fiftyPence);
		}
		
		if(twentyPence > 0) {
			System.out.println("20p Coins: " + twentyPence);
		}
		
		if(tenPence > 0) {
			System.out.println("10p Coins: " + tenPence);
		}
		
		if(fivePence > 0) {
			System.out.println("5p Coins: " + fivePence);
		}
		
		if(twoPence > 0) {
			System.out.println("2p Coins: " + twoPence);
		}
		
		if(onePence > 0) {
			System.out.println("1p Coins: " + onePence);
		}
		
		
		if(change == 0) {
			System.out.println("NO MORE CHANGE REQUIRED");
		}
		
		
		if(cost > paid) {
			System.out.println("PAYMENT NOT ENOUGH!");
		}
	}

}
