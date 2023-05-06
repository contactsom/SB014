package com.simplilearn.exceptionhandelinng;

public class Lab4 {

	public static void main(String[] args) {
		
		//getDivision(10,2);
		getDivision(10,0);
		
	}
	
	
	public static void getDivision(int a , int b) {
		// This is Risky Code 
		
		try {
				int c = a/b;
				System.out.println("Output : "+c);
			
		} catch (Exception e) {
			
			System.err.println("********Invalid Input**********");// red color 
		}
		
	}
	
	
}

