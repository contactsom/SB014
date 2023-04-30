package com.simplilearn.polymorphism2;

public class B extends A{

	@Override
	public String m1(String name) { //The method m1() of type B must override or implement a supertype method
		
		return "I am m1 method from Class B";
	}
}
