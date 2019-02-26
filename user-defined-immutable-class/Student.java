package com.string;

public class Student {
	
	//final field variables
	private final String name;
	private final Integer regNo;
	
	//public parameterized constructor (Shallow Copy)
	public Student(String name, Integer regNo) {
		this.name = name;
		this.regNo = regNo;
	}

	//Getter method of fields (No setter methods)
	public String getName() {
		return name;
	}

	public Integer getRegNo() {
		return regNo;
	}
}
