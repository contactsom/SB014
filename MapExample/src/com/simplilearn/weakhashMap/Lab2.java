package com.simplilearn.weakhashMap;

import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class Lab2 {

	public static void main(String[] args) {
		
		WeakHashMap<Integer,String> weakhashMap = new WeakHashMap<Integer,String>();
		weakhashMap.put(1, "Ram");
		weakhashMap.put(5, "Rohit");
		weakhashMap.put(3, "Chetan");
		weakhashMap.put(4, "Mahesh");
		weakhashMap.put(2, "laxman");
		
		Set<Integer>  keyset = weakhashMap.keySet();
		Iterator<Integer> itr = keyset.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			String value = weakhashMap.get(key);
			System.out.println("KEY - "+key +" Value - "+value);
			
			
			
			}
		
		
		
		
		
	}
}
