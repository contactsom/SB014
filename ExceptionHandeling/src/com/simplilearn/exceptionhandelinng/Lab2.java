package com.simplilearn.exceptionhandelinng;

public class Lab2 {

	public static void main(String[] args) {
		
		//getDivision(10,2);
		getDivision(10,0);
		
	}
	
	
	public static void getDivision(int a , int b) {
		int c = a/b;
		System.out.println("Output : "+c);
	}
	
	
}

/*
 * 
 *  Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.simplilearn.exceptionhandelinng.Lab2.getDivision(Lab2.java:16)
	at com.simplilearn.exceptionhandelinng.Lab2.main(Lab2.java:10)

 * */
