package com.simplilearn.methodg;

import com.simplilearn.methodf.A;

public class C extends A{

	public static void main(String[] args) {
		
		// You have to create the Object of Child Class
		// With the Help of child class call the method which is in out side of the package 
		C c = new C();
		c.getAdmission_BTechM();// This method is from com.simplilearn.methodf.A;
		
		
		//Does the child class access any methods from the parent class?
		// Public 	- YES
		// private 	- NO
		// Abstract - But it is all about un-implementation , not access 
	}
	
}
