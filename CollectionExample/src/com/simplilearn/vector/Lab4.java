package com.simplilearn.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab4 {

	public static void main(String[] args) {
		
		Vector<String> vector =new Vector<String>();
		vector.add("ABC");
		vector.add("200");
		vector.add("A");
		vector.add("B");
		vector.add("C");
		
		
		Iterator<String> itr = vector.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
