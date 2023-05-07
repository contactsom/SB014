package com.simplilearn.thread2;

public class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		// Business login
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("****Child : From class MyThread **** ::"+i);
		}
		
	}

}
