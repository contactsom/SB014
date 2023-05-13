package com.simplilearn.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab4 {

	public static void main(String[] args) {
		
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(123);
		lhs.add(133);
		lhs.add(143);
		lhs.add(153);
		
		
		Iterator<Integer>  itr = lhs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
