package com.simplilearn.exceptionhandelinng;

public class Lab15 {

	public static void main(String[] args)  {

		getDivision(10, 0); // Fail

	}

	public static void getDivision(int a, int b) {

			int c = a / b;
			
			throw new ArithmeticException("/ by zero");
			

		}

	

}
