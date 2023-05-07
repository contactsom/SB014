package com.simplilearn.thread;

public class MyRunnableThreadMain {

	public static void main(String[] args) {

		MyRunnableThread MyRunnableThread = new MyRunnableThread();
		
		Thread thread = new Thread(MyRunnableThread);
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("----Main : From class MyThreadMain---- ::"+i);
		}
		
	}
}