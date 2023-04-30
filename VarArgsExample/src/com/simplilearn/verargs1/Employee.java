package com.simplilearn.verargs1;

public class Employee {

	// var args - variables arguments 
	
	public int getAddition(int ...values ) {
		
		int sum = 0;
		
		for (int value : values) {
			
			sum = sum+value;
			
		}
		
		return sum;
	}
	
	
}
