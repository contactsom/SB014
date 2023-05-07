package com.simplilearn.equals;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		System.out.println(student1.hashCode());//366712642  //  961
		System.out.println(student2.hashCode());//1829164700 //  961
		
		
		System.out.println(student1.equals(student2));//false // true
	}
}





