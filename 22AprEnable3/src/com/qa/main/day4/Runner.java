package com.qa.main.day4;

import com.qa.main.day4.oopRecap.CafeShop;
import com.qa.main.day4.oopRecap.Drink;
import com.qa.main.day4.oopRecap.Sandwiches;

public class Runner {
	
	public static void main(String[] args) {
		
//		objects created
		
		Drink latte = new Drink("Latte", 3.19f, true, 325);
		Drink tea = new Drink("English Tea", 1.50f, true, 105);
		Drink cappuccino = new Drink("Cappuccino", 3.50f, false, 428);
		Drink americano = new Drink("Americano", 2.75f, true, 210);
		Drink icedTea = new Drink("Iced Tea", 3.75f, true, 400);
		
		
		Sandwiches tunaSweetcorn = new Sandwiches("Tuna & Sweetcorn", 625, 3.20f, false);
		Sandwiches eggCress = new Sandwiches("Egg & Cree", 525, 2.75f, true);
		Sandwiches blt = new Sandwiches("BLT", 700, 3.50f, false);
		
		
		CafeShop.addOrder(icedTea);
		CafeShop.addOrder(latte);
		CafeShop.addOrder(new Drink("Frappuccino", 4.25f, false, 400)); // for this there is no variable to access and recall it like there is for tea icedTea etc
		
		System.out.println(CafeShop.getAllOrders());
		
	}

}
