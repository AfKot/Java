package com.qa.main.day1;

// Note made as an example using 'Ctrl + /'
// All code goes inside {}

public class Main {
	

	public static void main(String[] args) {
		
//		Did this separately initially, with 2 separate system.out.println()
		returnText();
		System.out.println(returnNumber());
		System.out.println(returnText());
		PrintClass.sayHello();
		System.out.println(PrintShapes.printSquare());
		System.out.println(PrintColours.printRed());
		System.out.println(PrintColours.printBlue());
		System.out.println(PrintColours.printRed() + " " + PrintShapes.printSquare());
		System.out.println(PrintColours.printBlue() + " " + PrintShapes.printCircle());
		System.out.println("Concatenation Complete!");
		System.out.println(DataEx.printLetter());
		System.out.println(DataEx.printDec());
		System.out.println(DataEx.printLongDec());
		System.out.println(DataEx.printBool());
		System.out.println("Elon Musk's Net Worth is " + DataEx.printExtraLong() + " Dollars!");
		System.out.println(DataEx.forceReturn());
		
		System.out.println(Parameters.returnInfo("Afzal", 25));

				
	}
// public static void = 'magic words to make method work
// void = Don't RETURN
// If you want to return something you have to change the void to the datatype you want.
// 'printMessage' is the name of the method
// nameOfMethod - way it should be written
	
	public static void method1() {
		System.out.println("Hello World! 1, 2, 3");
		
	}
	
	public static void method2() {
		System.out.println("Run Text: ");
		method1();
	}
	
	public static String returnText() {
		return "Calculation Complete";
	}
	
	public static float returnNumber() {
		return (672*48);
	}
//	JAVA RETURNS: Anything after the return will never run.
	
}
