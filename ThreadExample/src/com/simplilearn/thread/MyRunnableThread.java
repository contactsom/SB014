package com.simplilearn.thread;

public class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		// Business login
		for (int i = 0; i < 5; i++) {
			System.out.println("****Child : From class MyThread **** ::"+i);
		}
		
	}

}
