package com.simplilearn.typecasting;


public class Lab2 {

	public static void main(String[] args) {
		

		//byte b = 130;
		
	
		byte b =(byte)130;
		System.out.println(b);//-126
		
		
		int a = 150;
		byte c = (byte)a;
		System.out.println(c);//-106
		
		
		int d = 150;
		short e = (short)d;
		System.out.println(e);// 150

	}

}
