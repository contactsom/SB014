package com.simplilearn.exceptionhandelinng;

public class CompanyEntryCheck {

	public static void main(String[] args) {
	
		String idCard="ID Card Not There";
		
		boolean isIdCard=false;
		
		if(isIdCard==true) {
			
			System.out.println("Grant the Office Permission");
			
		}else {
			
			throw new IDCardNotFoundException(idCard);
		}
		
	}

}
