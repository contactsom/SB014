package com.simplilarn.constructor;

public class Employee {

	String empName="Shruthi";// I am initialized the variable(empName) name as Shruthi
	
	public String empname;
	public int empSal;
	public String address;
	
	
	/// Constructor is responsable to initialized the Varaibles .

	public Employee(String empname, int empSal, String address) {
		super();
		this.empname = empname;
		this.empSal = empSal;
		this.address = address;
	}
	
	
}
