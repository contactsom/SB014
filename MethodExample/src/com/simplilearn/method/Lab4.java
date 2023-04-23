package com.simplilearn.method;

public class Lab4 {

	public static void main(String[] args) {
		
		Lab4 lab4 = new Lab4();
		
		lab4.getSum(101,21);
		//lab4.getSubtract(300, 20);
		//lab4.getMultiplication(20, 20);
		//lab4.getDivision(20, 2);
		
	}
	
	
	public void getSum(int a , int b) {
		
		int c = a + b;
		
		System.out.println("ADDITION  : "+c);
	}
	
	public void getSubtract(int a , int b) {
		
		int c = a - b;
		
		System.out.println("SUBTRACTION : "+c);
	}

	public void getMultiplication(int a , int b) {
		
		int c = a * b;
		
		System.out.println("MULTIPLICATION : "+c);
	}
	
	public void getDivision(int a , int b) {
		
		int c = a / b;
		
		System.out.println("DIVISION : "+c);
	}

}
