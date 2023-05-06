package com.simplilearn.exceptionhandelinng;

public class Lab5 {

	public static void main(String[] args) {
		
		getDivision(10,2); // Success
		getDivision(10,0); // Fail
		getDivision(20,2); // Success
		
	}
	
	
	public static void getDivision(int a , int b) {
		// This is Risky Code 
				int c = a/b;
				System.out.println("Output : "+c);
	}
	
	
}

