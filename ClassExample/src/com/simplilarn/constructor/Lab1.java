package com.simplilarn.constructor;

public class Lab1 {

	public static void main(String[] args) {
		
		
		Employee employee=new Employee("ujjwal",100,"Bangalore");
		
		System.out.println(employee.empname);//ujjwal
		System.out.println(employee.empSal);//100
		System.out.println(employee.address);//Bangalore
		
		//1. Create the object of Employee Class
			// 1.1. Employee Class got loaded 
			// 1.2. Constructor get called 
				// Ex : Employee("ujjwal",100,"Bangalore");
	
		//2. While calling the Constructor What happen ?
			//
			
		
		Employee employee1=new Employee("Amisha",500,"USA");
		System.out.println(employee1.empname);//ujjwal
		System.out.println(employee1.empSal);//100
		System.out.println(employee1.address);//Bangalore
		
		Employee employee2=new Employee("Chetan",500,"USA");
		Employee employee4=new Employee("Mahesh",500,"USA");
		
		// 4 object
		
		
	}
}
