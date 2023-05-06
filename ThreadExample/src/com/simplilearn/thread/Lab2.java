package com.simplilearn.thread;

public class Lab2 {

	public static void main(String[] args) {
		
		// Demon Thread 
		
		System.out.println(Thread.currentThread().getName());//main
		
		System.out.println(Thread.currentThread().getPriority());//Priority of main Thread , 5
 
		Thread.currentThread().setPriority(10);
		
		System.out.println(Thread.currentThread().getPriority());//Priority of main Thread , 10
		
		
	}
}
