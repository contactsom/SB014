package com.simplilearn.hashmap;

import java.util.HashMap;

public class Lab6 {

	public static void main(String[] args) {
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("Apple", "A");
		hashmap.put("Banana", "B");
		hashmap.put("Cat", "C");
		hashmap.put("Dod", "D");
		hashmap.put(null, "I am First Null Value");
		hashmap.put(null, "I am Second Null Value");
		
		System.out.println(hashmap);
		
		
	}
}
