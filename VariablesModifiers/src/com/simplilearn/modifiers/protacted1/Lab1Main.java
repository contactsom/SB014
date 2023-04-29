package com.simplilearn.modifiers.protacted1;

import com.simplilearn.modifiers.protacted.Lab1;

public class Lab1Main extends Lab1 {

	public static void main(String[] args) {
		
		//Lab1 lab1 = new Lab1();
		// Sub-class or Child class object 
		Lab1Main lab1Main = new Lab1Main();
		
		String myName = lab1Main.name;
		int myMarks =  lab1Main.marks;
		
		
		System.out.println("My Name "+myName);
		System.out.println("My Marks "+myMarks);
		
	}
}
