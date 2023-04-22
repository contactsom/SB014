package com.simplilarn.constructor;

public class Student {

	String stuName;
	int stuRoll;
	
	//1. Default/ No-Argument  Constructor 
	public Student() {
		super();
	}
	
	//2. Parameterized/Argument Constructor
	public Student(String stuName, int stuRoll) {
		super();
		this.stuName = stuName;
		this.stuRoll = stuRoll;
	}
	
	
	
}
