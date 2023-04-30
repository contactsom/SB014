package com.simplilearn.polymorphism;

public class GreetingsMain {

	public static void main(String[] args) {
		
		
		Greetings greetings = new Greetings();
		String wishmeNoArgument=greetings.wishMe();
		String wishmeOneArgument=greetings.wishMe("Deeksha");
		
		
		System.out.println(wishmeNoArgument);
		System.out.println(wishmeOneArgument);
		
	}
}
