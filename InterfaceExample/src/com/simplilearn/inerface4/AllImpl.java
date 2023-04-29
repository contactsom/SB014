package com.simplilearn.inerface4;

public class AllImpl implements A,B,C {

	@Override
	public void iImFromC() {
		System.out.println("I am the implementation of C");
	}

	@Override
	public void iImFromB() {
		System.out.println("I am the implementation of B");
	}

	@Override
	public void iImFromA() {
		System.out.println("I am the implementation of A");
	}

	
}
