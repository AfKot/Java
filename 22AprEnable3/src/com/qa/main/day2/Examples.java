package com.qa.main.day2;

public class Examples {
	
	public String name;
	
	
	public Examples(String name) {
		super();
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Examples [name=" + name + "]";
	}

	

	
	public int blackJack(int a, int b) {
		int total = a + b;
		if(a > 21 && b > 21) {
			return 0 ;
		} else if(a > 21) {
			return b;
		} else if(b > 21) {
			return a;
		} else if(b == 21) {
			return b;
		} else if (a == 21) {
			return a;
		} else {
			return a + b;
		}
	}
	
	public int uniqueSum(int a, int b, int c) {
		int sum = a + b + c;
		if(a == b && b == c) {
			return 0;
		} else if(a == b) {
			return c;
		} else if(b == c) {
			return a;
		} else {
			return sum;
		}
	}
	
	public String fizzBuzz(int a) {
		if (a % 3 == 0 && a % 5 == 0) {
			return "FizzBuzz";
		} else if (a % 3 == 0) {
			return "Fizz";
		} else if (a % 5 == 0) {
			return "Buzz";
		} else {
			return Integer.toString(a);
		}
	}
}
