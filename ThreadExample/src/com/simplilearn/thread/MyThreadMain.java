package com.simplilearn.thread;

public class MyThreadMain  {
	
	public static void main(String[] args) {
		
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		//myThread.run();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("----Main : From class MyThreadMain---- ::"+i);
		}
		
		
	}
	
	
}
