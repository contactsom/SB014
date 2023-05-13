package com.simplilearn.araylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab10 {

	public static void main(String[] args) {
		
		List<Integer> samsungMobile = new ArrayList<Integer>();
		
		samsungMobile.add(100);
		samsungMobile.add(110);
		samsungMobile.add(120);
		samsungMobile.add(103);
		samsungMobile.add(104);
		samsungMobile.add(150);
		
		
		Iterator<Integer> itr = samsungMobile.listIterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
	}
}
