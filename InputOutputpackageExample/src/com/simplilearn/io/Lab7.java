package com.simplilearn.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lab7 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("START- File Creating Start ");
		
		FileWriter filewriter = null;
		
		try {
			//filewriter = new FileWriter("IPL.txt",true); // append = true
			filewriter = new FileWriter("IPL.txt",false);
			filewriter.write("*****IPL 2023***** \n");
			filewriter.write("1. CSK Chennai Super Kings \n");
			filewriter.write("2. DC Delhi Capitals \n");
			filewriter.write("3. GT Gujarat Titans \n");
			filewriter.write("4. KKR Kolkata Knight Riders \n");
			filewriter.write("5. LSG Lucknow Super Giants \n");
			filewriter.write("6. MI Mumbai Indians \n");

		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			
			filewriter.flush();
			filewriter.close();
		}
		
		
		System.out.println("END- File Creating Completed ");
		
	}
}
