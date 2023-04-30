package com.simplilearn.polymorphism;

public class Addition {

	
	public int getAdd(int a , int b) {
		
		return a+b;
	}
	
	public int getAdd(int a , int b, int c) {
		
		return a+b+c;
	}
	
	public void getAdd(int a , int b, int c,int d) {
		
		int sum = a+b+c+d;
		System.out.println(sum);
		
	}
	
}
