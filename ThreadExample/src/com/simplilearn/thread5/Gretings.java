package com.simplilearn.thread5;

public class Gretings {

	public synchronized void wish(String name) {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Hello "+name+" Good Morning ");
			
		     try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
