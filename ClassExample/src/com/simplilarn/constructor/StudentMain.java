package com.simplilarn.constructor;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu= new Student();// Object(stu) created with the help of default Constructor
		
		Student stu1= new Student("Ujjwal", 101);// Object(stu1) created with the help of Parameterized Constructor
		
		// ClassName objectName = new classConstructor();
		
		
		System.out.println(stu.stuName);// null
		System.out.println(stu.stuRoll);// 0
		
		
		System.out.println(stu1.stuName);// Ujjwal
		System.out.println(stu1.stuRoll);// 101
		
	}
}
