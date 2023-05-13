package com.simplilearn.araylist;

import java.util.ArrayList;
import java.util.List;

public class Lab7 {

	public static void main(String[] args) {
		
		// 1. Create the ArrayList Object of Integer Type
		List<String> samsungMobile = new ArrayList<String>();
		
		// 2. Loaded the Value in to al 
		
		samsungMobile.add("Samsung Galaxy M33 5G ");
		samsungMobile.add("Samsung Galaxy M14 5G ");
		samsungMobile.add("Samsung Galaxy M13 5G ");
		
		samsungMobile.remove("Samsung Galaxy M13 5G ");
		
		
		System.out.println(samsungMobile);
		
		
		
	}
}
