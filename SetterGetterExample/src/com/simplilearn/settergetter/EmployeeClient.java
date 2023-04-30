package com.simplilearn.settergetter;

public class EmployeeClient {

	public static void main(String[] args) {
		
		Employee employee = new  Employee();
		
		employee.setEmpName("Abhinash");
		employee.setEmpSal(100);
		
		
		System.out.println(employee.empName+" "+" Bhaskar");
		System.out.println(employee.empSal);
		
		String name = employee.getEmpName();
		String empName=name+" "+" Bhaskar";
		int salary = employee.getEmpSal();
		
		System.out.println("NAME "+empName);
		System.out.println("SALARY "+salary);
		
		
	}

}
