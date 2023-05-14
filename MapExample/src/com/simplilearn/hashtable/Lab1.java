package com.simplilearn.hashtable;

import java.util.Hashtable;

public class Lab1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(1, "Chetan");
		hashTable.put(2, "Gunjan");
		hashTable.put(3, "Lahari");
		hashTable.put(4, "Seema");
		hashTable.put(5, "Mahesh");
		
		System.out.println(hashTable);
		
		
	} 
}
