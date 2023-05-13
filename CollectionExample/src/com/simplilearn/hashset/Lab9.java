package com.simplilearn.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Lab9 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(null);
		hashset.add(3);
		hashset.add(1);
		hashset.add(4);
		hashset.add(null);
		hashset.add(6);
		hashset.add(5);
		hashset.add(7);
		
		
		Iterator<Integer> itr = hashset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}
