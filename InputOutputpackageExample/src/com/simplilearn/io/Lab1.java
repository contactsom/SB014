package com.simplilearn.io;

import java.io.File;
import java.io.IOException;

public class Lab1 {

	public static void main(String[] args) {
		
		System.out.println("START- File Creating Start ");
		
		File f = new File("simplilearn.txt");
		
		try {
			
			f.createNewFile();
			
		} catch (IOException e) {

			e.printStackTrace();
			System.err.println("Error occured While creating the file");
		}
		
		
		System.out.println("START- File Creating Completed ");
		
	}
}
