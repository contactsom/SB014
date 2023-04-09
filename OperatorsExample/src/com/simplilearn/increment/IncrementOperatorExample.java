package com.simplilearn.increment;

public class IncrementOperatorExample {

	public static void main(String[] args) {
	
		int a = 10;
		System.out.println(a);
		
		int a1 = 10+1;
		System.out.println(a1);
		
		/*int a2 = 10++; // Invalid argument to operation ++/-- Why ? 
		System.out.println(a2);
		
		int a3 = ++10; // Invalid argument to operation ++/-- Why ? 
		System.out.println(a3);*/
		
		System.out.println("*********************");
		int x = 20;
		System.out.println("Before Increment : "+x); // 20
		x++;
		System.out.println("After Increment : "+x); // 21
		
		

	}

}
