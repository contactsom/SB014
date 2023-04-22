package com.simplilarn.constructor;

public class School {

	public String schoolName;

	
	// here Default constructor is Created by JVM
	// If you already have any constructor
	// Then I will not going to create the constructor for you
	
	public School() {
	}
	
	
	public School(String schoolName) {
		super();
		this.schoolName = schoolName;
	}

}
