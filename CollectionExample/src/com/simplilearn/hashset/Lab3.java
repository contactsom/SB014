package com.simplilearn.hashset;

import java.util.HashSet;

public class Lab3 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(1);
		hashset.add(2);
		hashset.add(3);
		hashset.add(1);
		hashset.add(2);
		hashset.add(3);
		
		
		System.out.println(hashset);
		
	}
}
