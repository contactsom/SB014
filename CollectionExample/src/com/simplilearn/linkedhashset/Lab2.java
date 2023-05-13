package com.simplilearn.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab2 {

	public static void main(String[] args) {
		
		Set lhs = new LinkedHashSet();
		lhs.add("A");
		lhs.add(123);
		lhs.add("RAM");
		lhs.add(12.0);
		
		System.out.println(lhs);
		
		
	}
}
