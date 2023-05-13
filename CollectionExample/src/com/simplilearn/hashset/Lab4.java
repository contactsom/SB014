package com.simplilearn.hashset;

import java.util.HashSet;

public class Lab4 {

	public static void main(String[] args) {
		
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("ABC");
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("ABC");
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		
		
		System.out.println(hashset);
		
	}
}
