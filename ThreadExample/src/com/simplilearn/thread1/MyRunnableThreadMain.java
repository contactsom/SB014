package com.simplilearn.thread1;

public class MyRunnableThreadMain {

	public static void main(String[] args) {

		MyRunnableThread MyRunnableThread = new MyRunnableThread();
		Thread thread = new Thread(MyRunnableThread);
		thread.start();
		
		MyRunnableThread MyRunnableThread1 = new MyRunnableThread();
		Thread thread1 = new Thread(MyRunnableThread1);
		thread1.start();
		
		MyRunnableThread MyRunnableThread2 = new MyRunnableThread();
		Thread thread2 = new Thread(MyRunnableThread2);
		thread2.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("----Main : From class MyThreadMain---- ::"+i);
		}
		
	}
}