package com.simplilearn.stack;

import java.util.Stack;

public class Lab2 {

	public static void main(String[] args) {
		//LIFO
		
		Stack stack = new Stack();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		
		System.out.println(stack);
		System.out.println(stack.search(4)); // 1
		System.out.println(stack.search(3)); // 2
		System.out.println(stack.search(2)); // 3
		System.out.println(stack.search(1)); // 4
		
		
		
	}
}
