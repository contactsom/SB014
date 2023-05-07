package com.simplilearn.hashcode;

import java.util.Objects;

public class Student {

	String stuname="ABC";
	int sturoll=123;
	
	
	public Student() {
		super();
	}
	
	public Student(String stuname, int sturoll) {
		super();
		this.stuname = stuname;
		this.sturoll = sturoll;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stuname, sturoll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(stuname, other.stuname) && sturoll == other.sturoll;
	}

	
	
	
}
