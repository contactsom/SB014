package com.simplilearn.thread4;

public class MyRunnableThreadMain {

	public static void main(String[] args) throws InterruptedException {

		MyRunnableThread MyRunnableThread = new MyRunnableThread();
		Thread thread = new Thread(MyRunnableThread);
		thread.start();
		
		Thread.sleep(60000);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("----Main : From class MyThreadMain---- ::"+i);
		}
		
		
	}
}