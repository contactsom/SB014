package com.simplilearn.exceptionhandelinng;

public class Lab8 {

	public static void main(String[] args) {

		getDivision(10, 2); // Success
		getDivision(10, 0); // Fail
		getDivision(20, 2); // Success

	}

	public static void getDivision(int a, int b) {

			System.out.println("*********getDivision() - 1  ");
		try {
			System.out.println("*********getDivision() - 2  ");
			int c = a / b;
			System.out.println("*********getDivision() - 3  ");
			System.out.println("Output : " + c);
			System.out.println("*********getDivision() - 4  ");
			System.out.println("*********getDivision() - 5  ");

		} catch (Exception e) {
			System.out.println("*********getDivision() - 6  ");
			System.err.println("******* Please correct the User Input **********");
		}

	}

}


/*
 * 	Failure Cases :
 * getDivision(10, 0); // Fail
 * 
 * 			System.out.println("*********getDivision() - 1  ");
 * 			System.out.println("*********getDivision() - 2  ");
			System.out.println("*********getDivision() - 6  ");
			System.err.println("******* Please correct the User Input **********");
 * 
 *  Success Case :
 * 
 * getDivision(10, 2); // Success
 * getDivision(20, 2); // Success
 * 
 *  *********getDivision() - 1  
	*********getDivision() - 2  
	*********getDivision() - 3  
	Output : 5
	*********getDivision() - 4  
	*********getDivision() - 5  

 * 
 * */








