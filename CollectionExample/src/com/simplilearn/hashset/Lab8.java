package com.simplilearn.hashset;

import java.util.HashSet;

public class Lab8 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(null);
		hashset.add(3);
		hashset.add(1);
		hashset.add(4);
		hashset.add(null);
		
		
		
		System.out.println(hashset);
		
	}
}
