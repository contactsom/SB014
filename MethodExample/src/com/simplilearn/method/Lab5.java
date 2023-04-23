package com.simplilearn.method;

public class Lab5 {

	public static void main(String[] args) {
		
		Lab5 lab4 = new Lab5();
		
		int output=lab4.getSum(101,21);
		
		int finalOutput=output+200;
		
		System.out.println(finalOutput);
		
		
	}
	
	// method "getSum()" is returning as int 
	public int getSum(int a , int b) {
		
		int c = a + b;
		
		return c;
		
		
	}
	

}
