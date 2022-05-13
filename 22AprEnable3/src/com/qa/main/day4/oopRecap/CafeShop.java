package com.qa.main.day4.oopRecap;

import java.util.ArrayList;

public class CafeShop {
	
//	ArrayList takes in objects of type Drink
	
	public static ArrayList<Drink> orderList = new ArrayList<>();
	
	public static boolean addOrder(Drink order) {
		return orderList.add(order);
		
	}
	
//	method to return ArrayList
	
	public static ArrayList<Drink> getAllOrders() {
		return orderList;
	}

}
