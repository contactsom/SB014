package com.simplilearn.io;

import java.io.File;
import java.io.IOException;

public class Lab3 {

	public static void main(String[] args) {
		
		System.out.println("START- File Creating Start ");
		
		try {
			
			File directory = new File("FILE_DATA");
			
			directory.mkdir();
			
			File file = new File("FILE_DATA","abc.txt");
			
			file.createNewFile();
			
			
		} catch (IOException e) {

			e.printStackTrace();
			System.err.println("Error occured While creating the file");
		}
		
		
		System.out.println("END- File Creating Completed ");
		
	}
}
