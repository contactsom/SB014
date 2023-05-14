package com.simplilearn.identityhashmap;

import java.util.IdentityHashMap;

public class Lab1 {

	public static void main(String[] args) {
		
		IdentityHashMap<Integer, String> ihm = new IdentityHashMap<Integer, String>();
		
		ihm.put(2, "C");
		ihm.put(1, "A");
		ihm.put(4, "D");
		ihm.put(3, "B");
		
		System.out.println(ihm);
		
		
		
	}
}
