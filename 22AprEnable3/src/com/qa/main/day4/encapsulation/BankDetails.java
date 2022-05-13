package com.qa.main.day4.encapsulation;

public class BankDetails {
	
	private float balance;
	private String accountNumber; // use string as you dont want the first 0 to go missing, eg, 023643242 --> 23643242
	private String userName;
	private String password;
	
	public BankDetails(float balance, String accountNumber, String userName, String password) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.password = password;
	}

	
//	encapsulation is used to add methods and functionality to restrict data changes
//	variables should be private not public in order for this
//	if the values are private then they cant be changed
	
//  we add getters and setters to allow this data change where we want it to be allowed
//	generate using shift + alt + 's' as we did usually
	
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
		if(balance <=10000) {
			System.out.println("Balance Updated");
		} else {
			System.out.println("Balance above limit");
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUserName() {
		return "Your Username: " + userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword(String passLock) {
		if(passLock == "Unlock") {
			return password;
		} else {
			return "Incorrect Passcode.";
		}
	}

	public void setPassword(String password) {
		this.password = password;
		
	}
	
	

	
	

}
