package com.simplilearn.foreach;

public class Lab1 {

	public static void main(String[] args) {

		
		int[] myArray = {99,33,44,22,1,6,8,3,0};
		int sizeofArray = myArray.length;
		System.out.println("Length of Array is : "+sizeofArray);
		
		for (int arrayelement : myArray) {
			
			System.out.println(arrayelement);
		}
		
	}

}
