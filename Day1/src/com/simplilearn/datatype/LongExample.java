package com.simplilearn.datatype;

public class LongExample {

	public static void main(String[] args) {
		
		long l1 = 9223372036854775807L;
		System.out.println(l1);
		
		long l2 = 9223372036854775806l;
		System.out.println(l2);
		
		//long l3 = 9223372036854775808l;
		//System.out.println(l3);
		
		long l4 = -9223372036854775808l;
		System.out.println(l4);
		
		//long l5 = -9223372036854775809l;
		//System.out.println(l5);
		

		System.out.println("********** Comparison byte Vs short Vs int Vs long ********** ");
		
		byte ss1 = 127;
		System.out.println(ss1);
		
		short ss2 = 127;
		System.out.println(ss2);
		
		int ss3 = 127;
		System.out.println(ss3);
		
		long ss4 = 127;
		System.out.println(ss4);
	}

}
