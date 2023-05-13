package com.simplilearn.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Lab4 {

	public static void main(String[] args) {

		Set tset =new TreeSet();
		tset.add(null);
		tset.add("ABC");
		tset.add("123");
		tset.add("12.3");
		tset.add("ABC");
		tset.add("123");
		tset.add("12.3");
		
		
		System.out.println(tset);
		
	}

}
