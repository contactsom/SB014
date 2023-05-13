package com.simplilearn.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Lab3 {

	public static void main(String[] args) {
		
		Vector<String> vector =new Vector<String>();
		vector.add("ABC");
		vector.add("200");
		vector.add("A");
		vector.add("B");
		vector.add("C");
		
		Enumeration e = vector.elements();
		
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
		
		
	}
}
