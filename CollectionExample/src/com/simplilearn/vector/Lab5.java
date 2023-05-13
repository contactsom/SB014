package com.simplilearn.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab5 {

	public static void main(String[] args) {
		
		Vector<String> vector =new Vector<String>();
		vector.add("ABC");
		vector.add("200");
		vector.add("A");
		vector.add("B");
		vector.add("C");
		
		
		Iterator<String> itr = vector.iterator();
		
		while(itr.hasNext()) {
			String value= itr.next();
			if(value.equals("A")) {
				System.out.println("A found ");
			}
		}
		
		
	}
}
