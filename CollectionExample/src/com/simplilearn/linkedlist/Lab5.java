package com.simplilearn.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Lab5 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("Mohan");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		
		Iterator<String> itr = ll.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
	}
}
