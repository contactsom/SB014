package com.simplilearn.increment;

/*Difference between b++ and b+1*/

public class IncrementOperatorExample12 {

	public static void main(String[] args) {
	
		int c = 20;
		    c = c+1;// int = int + int
		System.out.println("Value of c is : "+c); // 21
		
	
		double c1 = 20;
	    	   c1 = c1+1;// double = double + int
	    System.out.println("Value of c1 is : "+c1); // 21.0
		

	    long c2 = 20L;
 	   		 c2 = c2+1; // long = long + int
 	   	System.out.println("Value of c2 is : "+c2); // 21
 	   	
 	   	
 	    float c3 = 20F;
  		 	  c3 = c3+1; // float = float + int
  		System.out.println("Value of c3 is : "+c3); // 21.0
  		 
  		
  		byte c4 = 20;
		 	 //c4 = c4+1;	// byte = byte + int
		System.out.println("Value of c3 is : "+c4); // Error
		 
		// byte = byte + int
		// 1 byte =  1 byte + 4 byte
		// 1 byte =  5 byte
		// I am trying to store 4 byte value in to 1 byte memory 
		// Where data loss is expected 
		// Hence Compiler is throwing the error 
		
  		 
  	
	}

}
