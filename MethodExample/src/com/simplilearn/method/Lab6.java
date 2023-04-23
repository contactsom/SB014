package com.simplilearn.method;

public class Lab6 {

	public static void main(String[] args) {
		
		String schoolName="DPS";
		
		Lab6 lab6 = new Lab6();
		
		String studentName1 = lab6.getName("Jaya", "Chandra");
		String studentName2 = lab6.getName("Gunjan", "Deshmukh ");
		
		String finaloutput1=studentName1+" Studing in "+schoolName;
		System.out.println(finaloutput1);
		
		String finaloutput2=studentName2+" Studing in "+schoolName;
		System.out.println(finaloutput2);
	
		
		
	}
	
	
	public String getName(String firstName , String LastName) {
		
		String name  = firstName +" "+ LastName;
		
		return name;
		
		
	}
	

}
