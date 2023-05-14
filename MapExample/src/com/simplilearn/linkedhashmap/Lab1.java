package com.simplilearn.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Lab1 {

	public static void main(String[] args) {
		

		LinkedHashMap<Integer, String> hashmap = new LinkedHashMap<Integer, String>();
		hashmap.put(101, "A");
		hashmap.put(102, "B");
		hashmap.put(103, "C");
		hashmap.put(104, "D");
		
		System.out.println(hashmap);
	}
}
