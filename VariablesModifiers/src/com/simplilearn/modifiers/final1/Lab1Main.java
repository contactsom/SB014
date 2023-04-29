package com.simplilearn.modifiers.final1;

public class Lab1Main {

	public static void main(String[] args) {
		
		
		Lab1 lab1 = new Lab1();
		String myName = lab1.name;
		int myMarks   = lab1.marks;
		float percentMarks=lab1.percentMarks;
		
		
		System.out.println("My Name "+myName); // null
		System.out.println("My Marks "+myMarks);// 0
		System.out.println("My Percent Marks "+percentMarks);// 0.0
		
	}
}
