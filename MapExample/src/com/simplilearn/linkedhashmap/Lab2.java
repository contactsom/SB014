package com.simplilearn.linkedhashmap;

import java.util.LinkedHashMap;

public class Lab2 {

	public static void main(String[] args) {
		

		LinkedHashMap<Integer, String> hashmap = new LinkedHashMap<Integer, String>();
		
		hashmap.put(104, "A");
		hashmap.put(102, "B");
		hashmap.put(103, "C");
		hashmap.put(101, "D");
		hashmap.put(109, "E");
		
		System.out.println(hashmap);
	}
}
