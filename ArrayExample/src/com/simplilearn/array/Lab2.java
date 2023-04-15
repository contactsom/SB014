package com.simplilearn.array;

public class Lab2 {

	public static void main(String[] args) {
		

	
		int[] rollNumber = {101,21,31,41,51,61};
		
		System.out.println(rollNumber[0]); // 101
		System.out.println(rollNumber[1]); // 21
		System.out.println(rollNumber[2]); // 31
		System.out.println(rollNumber[3]); // 41
		System.out.println(rollNumber[4]); // 51
		System.out.println(rollNumber[5]); // 61
		//System.out.println(rollNumber[6]); // java.lang.ArrayIndexOutOfBoundsException: 6
		
		System.out.println("**************************");
		
		String[] studentName= {"Mahesh Mane","Amisha","chetan","vaibhav","Rajpal yadav"};
		System.out.println(studentName[0]); // Mahesh Mane
		System.out.println(studentName[1]); // Amisha
		System.out.println(studentName[2]); // chetan
		System.out.println(studentName[3]); // vaibhav
		System.out.println(studentName[4]); // Rajpal yadav
		//System.out.println(studentName[5]); // java.lang.ArrayIndexOutOfBoundsException: 5
		
		System.out.println("**************************");
		int[] myArray= {0,1,2,3,4};
		System.out.println(myArray[0]); // 0
		System.out.println(myArray[1]); // 1
		System.out.println(myArray[2]); // 2
		System.out.println(myArray[3]); // 3
		System.out.println(myArray[4]); // 4
		System.out.println(myArray[5]); // java.lang.ArrayIndexOutOfBoundsException: 5
		

		
	}

}
