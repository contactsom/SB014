package com.simplilearn.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Lab2 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(1, "Chetan");
		hashTable.put(2, "Gunjan");
		hashTable.put(3, "Lahari");
		hashTable.put(4, "Seema");
		hashTable.put(5, "Mahesh");
		
		Set<Integer>  set = hashTable.keySet();
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			int key = itr.next();
			String value = hashTable.get(key);
			System.out.println("KEY  - "+key+" VALUE "+value);
			
			}
		
		
		
		
		
	} 
}
