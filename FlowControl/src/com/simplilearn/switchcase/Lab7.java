package com.simplilearn.switchcase;

public class Lab7 {

	public static void main(String[] args) {
	
		System.out.println("********* START- Lab5 ***************");
		String myNameis = "vijay";
		
		switch(myNameis) {
		
			case "Kiranmoy":
				System.out.println("I am Kiranmoy");
				break;
				
			case "chetan":
				System.out.println("I am chetan");
				break;
				
			case "prabhas":
				System.out.println("I am prabhas");
				break;
				
			case "vijay":
				System.out.println("I am vijay");
				break;
				
			case "Rajpal":
				System.out.println("I am Rajpal");
				break;
			default:
				System.out.println("I am default , Unfortunately no case statement matched");
		}
		
		System.out.println("********* END- Lab5 ***************");

	}

}
