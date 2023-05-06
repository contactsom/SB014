package com.simplilearn.exceptionhandelinng;

public class Lab10 {

	public static void main(String[] args) {

		getDivision(10, 2); // Success
		getDivision(10, 0); // Fail
		getDivision(20, 2); // Success

	}

	public static void getDivision(int a, int b) {

		try {
			int c = a / b;
			System.out.println("Output : " + c);

		} catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println("Exception Message : "+e.getMessage());
			System.err.println("******* Please correct the User Input **********");
		}

	}

}










