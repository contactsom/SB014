package com.simplilearn.thread5;

public class MyRunnableThread implements Runnable {

	Gretings gretings;
	String name;
	
	public MyRunnableThread(Gretings gretings, String name) {
		super();
		this.gretings = gretings;
		this.name = name;
	}



	@Override
	public void run() {
		// Business login
		gretings.wish(name);
		
	}

}
