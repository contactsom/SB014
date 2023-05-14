package com.simplilearn.weakhashMap;

import java.util.WeakHashMap;

public class Lab1 {

	public static void main(String[] args) {
		
		WeakHashMap<Integer,String> weakhashMap = new WeakHashMap<Integer,String>();
		weakhashMap.put(1, "A");
		weakhashMap.put(5, "E");
		weakhashMap.put(3, "C");
		weakhashMap.put(4, "D");
		weakhashMap.put(2, "B");
		
		System.out.println(weakhashMap);
		
		
		
	}
}
