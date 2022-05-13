package com.qa.main.day2;

public class Calculator {
	
	public static String addValues(int a, int b, int c) {
		int result = a + b + c;
//		Make sure you use Modulus '%' as this means the remainder is = to...
		if(result % 2 == 0) {
			return a + " + " + b + " + " + c + " = " + result + " (Result is Even)"; 
		} else {
		return a + " + " + b + " + " + c + " = " + result + " (Result is Odd)" ;
	}
}
	
	public static String subValues(int d, int e) {
		int result = d - e;
		if(result > 0) {
		return d + " - " + e + " = " + result;
	} else {
		return "The Result is Negative!!"; 
	}
	}
	
	public static String mulValues(int f, int g) {
		int result = f*g;
		if(g == 10) {
			return "Add a 0! Mental Maths!";
		} else {
		return f + " x " + g + " = " + result;
		}
	}

	public static String divValues(int x, int y) {
		float result = 0;
		result = (float) x/y;
		if(y == 0) {
			return "ERROR! Can't Divide by 0.";
		} else {
			return x + " / " + y + " = " + result;
		}
	
		
	}
	
	public static String squValues(int z) {
		int result = z*z;
		return z + " Squared = " + result;
	}
}
