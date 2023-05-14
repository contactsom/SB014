package com.simplilearn.io;

import java.io.File;
import java.io.IOException;

public class Lab5 {

	public static void main(String[] args) {
		
		System.out.println("START- File Creating Start ");
		
		File file = new File("/Users/om/SB014/");//For windows : "c:\\FOLDER_NAME"
		String[] listofFileFolders = file.list();
		
		for (String listofFileFolder : listofFileFolders) {
			
			File f = new File(file,listofFileFolder);
			
			if(f.isFile()) {
				System.out.println("FILES : "+listofFileFolder);
			}
			
		}
		
		
		System.out.println("END- File Creating Completed ");
		
	}
}
