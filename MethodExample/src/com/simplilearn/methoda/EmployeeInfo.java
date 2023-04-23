package com.simplilearn.methoda;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		String output=emp.getEmpInfo("Gunjan Deshmukh", "Google");
		
		System.out.println(output);
		
		String empname=emp.employeeName;
		System.out.println(empname);
		

	}

}
