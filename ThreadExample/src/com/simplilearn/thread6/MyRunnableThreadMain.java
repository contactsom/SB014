package com.simplilearn.thread6;

public class MyRunnableThreadMain {

	public static void main(String[] args) throws InterruptedException {

		
		Gretings gretings = new Gretings();
		
		MyRunnableThread myRunnableThread1 = new MyRunnableThread(gretings,"Amisha");
		Thread thread1 = new Thread(myRunnableThread1);
		thread1.start();
		
		
		MyRunnableThread myRunnableThread2 = new MyRunnableThread(gretings,"Gunjan");
		Thread thread2 = new Thread(myRunnableThread2);
		thread2.start();
		
		
		
	}
}