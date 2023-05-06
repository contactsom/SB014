package com.simplilearn.thread;

public class Lab1 {

	public static void main(String[] args) {
		
		// Demon Thread 
		
		System.out.println(Thread.currentThread().getName());//main
		Thread.currentThread().setName("Vaibhav");
		
		System.out.println(Thread.currentThread().getName());//Vaibhav
		
	}
}
