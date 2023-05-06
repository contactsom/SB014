package com.simplilearn.exceptionhandelinng;

public class Lab14 {

	public static void main(String[] args) throws Exception {

		// getDivision(10, 2); // Success
		getDivision(10, 0); // Fail
		// getDivision(20, 2); // Success

	}

	public static void getDivision(int a, int b) throws Exception {

		try {
			int c = a / b;

		} catch (Exception e) {

			System.out.println("*** I am catch ****");

		}

	}

}
