package com.qa.main.day4.encapsulation;


public class Runner {

	public static void main(String[] args) {
		
		BankDetails user1 = new BankDetails(500, "09876543", "SuperMan", "Pass12345" );
		
		user1.setBalance(1000f);
		System.out.println(user1.getAccountNumber());
		System.out.println(user1.getBalance());
		
		System.out.println("------------");
		
		System.out.println(user1.getPassword("Unlock"));
		user1.setPassword("Pass1234");
		System.out.println(user1.getPassword("Unlock"));
		
		System.out.println("------------");
			
		
	}
	
}
