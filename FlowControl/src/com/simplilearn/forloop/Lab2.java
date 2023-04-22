package com.simplilearn.forloop;

public class Lab2 {

	public static void main(String[] args) {
		
		int[] myArray = {99,33,44,22,1,6,8,3,0};
		
		int sizeofArray = myArray.length;// 9 last Index = (9-1) = 8
		System.out.println("Length of Array is : "+sizeofArray); // 9 -> 900
		
		
		for(int i = 0; i <= sizeofArray-1; i++) {
			
			System.out.println(myArray[i]);
		}
			
		// Execution Track :
		
		/*
		 * Iteration 1: 
		 * 		i  = 0
		 * 		0 <= (9-1) -> true
		 * 		System.out.println(myArray[0]);
		 * 		i = 1
		 * 
		 * Iteration 2: 
		 * 		i <= sizeofArray-1
		 * 		i <= (9-1)
		 * 		1 <= (9-1)  -> true
		 * 		System.out.println(myArray[1]);
		 * 		i = 2
		 * 
		 * Iteration 3: 
		 * 		i <= sizeofArray-1
		 * 		i <= (9-1)
		 * 		2 <= (9-1)  -> true
		 * 		System.out.println(myArray[2]);
		 * 		i = 3
		 *
		 ** Iteration 4: 
		 * 		i <= sizeofArray-1
		 * 		i <= (9-1)
		 * 		3 <= (9-1)  -> true
		 * 		System.out.println(myArray[3]);
		 * 		i = 4
		 * 
		 *Iteration 5: 
		 * 		i <= sizeofArray-1
		 * 		i <= (9-1)
		 * 		4 <= (9-1)  -> true
		 * 		System.out.println(myArray[4]);
		 * 		i = 5
		 * 
		 *Iteration 6: 
		 * 		i <= sizeofArray-1
		 * 		i <= (9-1)
		 * 		5 <= (9-1)  -> true
		 * 		System.out.println(myArray[5]);
		 * 		i = 6
		 * 
		 *Iteration 7: 
		 * 		i <= sizeofArray-1
		 * 		i <= (9-1)
		 * 		6 <= (9-1)  -> true
		 * 		System.out.println(myArray[6]);
		 * 		i = 7
		 * 
		 *Iteration 8: 
		 * 		i <= sizeofArray-1
		 * 		i <= (9-1)
		 * 		7 <= (9-1)  -> true
		 * 		System.out.println(myArray[7]);
		 * 		i = 8
		 * 
		 *Iteration 9: 
		 * 		i <= sizeofArray-1
		 * 		i <= (9-1)
		 * 		8 <= (9-1)  -> true
		 * 		System.out.println(myArray[8]);
		 * 		i = 9
		 * 
		 *Iteration 10: 
		 * 		i <= sizeofArray-1
		 * 		i <= (9-1)
		 * 		9 <= (9-1)  -> false
		 * 		loop terminated 
			*/
	}
}
