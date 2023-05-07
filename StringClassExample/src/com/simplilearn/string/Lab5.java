package com.simplilearn.string;

public class Lab5 {

	public static void main(String[] args) {
		
		// String Constant Pool (SCP)
		
		
		String str1 = new String("Mahesh");
		String str2 = new String("Mahesh");

		String str3 = "Mahesh";
		String str4 = "Mahesh";
		
		System.out.println(str1.equals(str2));// = true
		System.out.println(str3.equals(str4));// = true
		
		
	}
}
