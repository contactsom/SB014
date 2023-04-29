package com.simplilearn.inerface5;

public class Wish implements Greetings,Welcome{

	@Override
	public void sayHi() {
	
		String name = "Amisha";
		
		System.out.println("Hello "+name+" Good Evening");
		
	}
	
}
