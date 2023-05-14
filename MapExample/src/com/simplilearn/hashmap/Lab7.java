package com.simplilearn.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Lab7 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(101, "A");
		hashmap.put(102, "B");
		hashmap.put(103, "C");
		hashmap.put(104, "D");
		
		// Cursor
		Set<Integer> keyset= hashmap.keySet();
		
		Iterator<Integer> itr = keyset.iterator();
		
		while(itr.hasNext()) {
			
			int keys=itr.next();
			
			String value = hashmap.get(keys);
			
			System.out.println("KEY - "+keys+" Value - "+value);
		}
		
		
		
		
	}
}
