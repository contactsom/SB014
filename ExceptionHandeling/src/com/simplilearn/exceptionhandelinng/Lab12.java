package com.simplilearn.exceptionhandelinng;

public class Lab12 {

	public static void main(String[] args) {

		//getDivision(10, 2); // Success
		getDivision(10, 0); // Fail
	   // getDivision(20, 2); // Success

	}

	public static void getDivision(int a, int b) {

		try {

			//System.exit(0);// Terminating your JVM abnormally 
			int c = a / b;
			System.out.println("*** I am try ****");

		} catch (Exception e) {
			System.out.println("*** I am Catch ****");
			System.exit(0);// Terminating your JVM abnormally 
			
		} finally {
			// I do not care others , I will execute always 
			System.out.println("*** I am Finally ****");
			
			// This block is usefull or required when we want to close the resourse / connection / cleanup 
		}

	}

}
