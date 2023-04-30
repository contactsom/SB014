package com.simplilearn.polymorphism2;

public class Clinet {

	public static void main(String[] args) {
		
		B b = new B();
		
		String output1=b.m1("Gunjan");
		System.out.println(output1);
		
		
		A a = new A();
		Object outpu2=a.m1("Chetan");
		System.out.println(outpu2);
		
		
	}
}
