package com.simplilearn.b;

import com.simplilearn.a.Employee;

public class HCLJob {

	public static void main(String[] args) {
		
		System.out.println("*****START-SimplilearnJob*****");
		
		// I want to get the Employee Name and Salary from Employee Class
		
		// 1. Create the Object of the Employee Class
		
			Employee employee = new Employee();
			
		// 2. with the object name call the Employee Name and Salary
			
			String name= employee.empName;
			int salary = employee.empSalery;
			String gender= employee.gender;
			
			System.out.println("NAME : "+name);
			System.out.println("SALARY : "+salary);
			System.out.println("GENDER : "+gender);
		
		System.out.println("*****END-SimplilearnJob*****");
	}
}
