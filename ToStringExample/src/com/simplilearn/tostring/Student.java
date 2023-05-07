package com.simplilearn.tostring;

public class Student {

	String stuname;
	int sturoll;
	
	
	public Student() {
		super();
	}
	
	public Student(String stuname, int sturoll) {
		super();
		this.stuname = stuname;
		this.sturoll = sturoll;
	}

	
	@Override
	public String toString() {
		return "Student [StudentName=" + stuname + ", StudentRoll=" + sturoll + "]";
	}
	
	
	
}
