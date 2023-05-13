package com.simplilearn.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab5 {

	public static void main(String[] args) {

		Set<String> tset =new TreeSet<String>();
		tset.add("ABC");
		tset.add("123");
		tset.add("12.3");
		tset.add("ABC");
		tset.add("123");
		tset.add("12.3");
		
		Iterator<String> itr = tset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	
		
	}

}
