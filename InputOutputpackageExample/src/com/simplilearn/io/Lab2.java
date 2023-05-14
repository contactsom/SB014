package com.simplilearn.io;

import java.io.File;
import java.io.IOException;

public class Lab2 {

	public static void main(String[] args) {
		
		System.out.println("START- File Creating Start ");
		
		File f = new File("student.txt");
		
		try {
			
			if(f.exists()) {
				System.err.println("File Can not created as it is Already Exist");
			}else {
				
				f.createNewFile();
			}
			
			
		} catch (IOException e) {

			e.printStackTrace();
			System.err.println("Error occured While creating the file");
		}
		
		
		System.out.println("END- File Creating Completed ");
		
	}
}
