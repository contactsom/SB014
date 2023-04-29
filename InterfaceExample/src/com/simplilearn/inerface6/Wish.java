package com.simplilearn.inerface6;

public class Wish implements Greetings,Welcome{

	
	@Override
	public void sayHi() {
		 
		System.out.println("Hello Good Morning ");
		
	}

	@Override
	public void sayHi(String name) {
	System.out.println("Hello "+name+" Good Morning ");
		
	}

	
	
}
