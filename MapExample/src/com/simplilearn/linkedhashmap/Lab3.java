package com.simplilearn.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Lab3 {

	public static void main(String[] args) {
		

		LinkedHashMap<Integer, String> hashmap = new LinkedHashMap<Integer, String>();
		
		hashmap.put(104, "A");
		hashmap.put(102, "B");
		hashmap.put(103, "C");
		hashmap.put(101, "D");
		hashmap.put(109, "E");
		
		Set<Integer> keyset = hashmap.keySet();
		Iterator <Integer> itr = keyset.iterator();
		
		while(itr.hasNext()) {
			
			int key = itr.next();
			String value = hashmap.get(key);
			System.out.println("KEY  - "+key+" VALUE - "+value);
		}
		
		
		
		
		
		
	}
}
