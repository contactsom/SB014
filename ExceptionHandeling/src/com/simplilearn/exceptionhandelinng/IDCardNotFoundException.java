package com.simplilearn.exceptionhandelinng;

public class IDCardNotFoundException  extends RuntimeException{
	
	
	IDCardNotFoundException(String s){
		super(s);
	}
	
}

/*
 * How to Create your own Exception or Custom Exception
 * What is the use of throw key word in Exception handling 
 * 
 * 1. Create the Exception Class
 * 2. extends RuntimeException
 * 3. Prepare the constructor i.e IDCardNotFoundException
 * */
 