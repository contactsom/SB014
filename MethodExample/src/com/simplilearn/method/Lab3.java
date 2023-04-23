package com.simplilearn.method;

public class Lab3 {

	public static void main(String[] args) {
		
		Lab3 lab3 = new Lab3();// Creating the Object of Class "Lab3" where object name is "lab3"
		
		lab3.getSum(101,21);
		
	}
	
	// write a method
	public void getSum(int a , int b) {
		
		int c = a + b;// Adding Two Numbers
		
		System.out.println(c);// 12
	}
}
