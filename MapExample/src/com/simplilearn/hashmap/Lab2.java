package com.simplilearn.hashmap;

import java.util.HashMap;

public class Lab2 {

	public static void main(String[] args) {
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		hashmap.put("101", "A");
		hashmap.put("102", "B");
		hashmap.put("103", "C");
		hashmap.put("104", "D");
		hashmap.put("103", "CC");
		hashmap.put("104", "DD");
		
		System.out.println(hashmap);
		
		
	}
}
