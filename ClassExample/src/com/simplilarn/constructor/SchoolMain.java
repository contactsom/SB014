package com.simplilarn.constructor;

public class SchoolMain {

	public static void main(String[] args) {
		
		School school=new School();
		// Why this line not giving you error
		// here Default constructor is Created by JVM
		
		School school1=new School("DPS");
		
	}
}