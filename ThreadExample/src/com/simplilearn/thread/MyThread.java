package com.simplilearn.thread;

public class MyThread extends Thread {

	
	@Override
	public void run() {
		super.run();
		// Business login
		
		for (int i = 0; i < 5; i++) {
			System.out.println("****Child : From class MyThread **** ::"+i);
		}
		
	}
}
