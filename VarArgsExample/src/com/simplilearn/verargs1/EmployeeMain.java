package com.simplilearn.verargs1;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		int sum1=employee.getAddition(2,3);
		System.out.println(sum1);
		
		int sum2=employee.getAddition(2,3,4);
		System.out.println(sum2);
		
		int sum3=employee.getAddition(2,3,4,5);
		System.out.println(sum3);
		
	}
}
