package com.simplilearn.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Lab10 {

	public static void main(String[] args) {
		
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("Sai");
		hashset.add("Rohit");
		hashset.add("Kumar");
		hashset.add("Bhaskar");
		hashset.add("Ram");
		hashset.add("Jayachandra Prabha");
		
		Iterator<String> itr = hashset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}
