package com.simplilearn.treemap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Lab4 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> treemap = new TreeMap<Integer,String>();
		
		treemap.put(1, "AA");
		treemap.put(2, "BB");
		treemap.put(3, "CC");
		treemap.put(4, "DD");
		treemap.put(5, "EE");
		
		
		Set<Integer> keySet = treemap.keySet();
		Iterator<Integer> itr = keySet.iterator();
		
		while(itr.hasNext()) {
			int key =itr.next();
			String value = treemap.get(key);
			
			System.out.println("KEY  - "+key+" VALUE - "+value);
		}
		
		
		
		
		
	}
}
