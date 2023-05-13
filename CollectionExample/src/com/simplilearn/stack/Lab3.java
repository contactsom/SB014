package com.simplilearn.stack;

import java.util.Iterator;
import java.util.Stack;

public class Lab3 {

	public static void main(String[] args) {
		//LIFO
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
	
		Iterator<Integer> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}
