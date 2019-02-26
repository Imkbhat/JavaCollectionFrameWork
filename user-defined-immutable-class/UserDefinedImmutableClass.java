package com.string;

public class UserDefinedImmutableClass {

	public static void main(String[] args) {
		Student student  = new Student("Bhatt", 123);
		System.out.println("Name ==> "+student.getName());
		System.out.println("RegNo ==> "+student.getRegNo());
		
		//student.regNo = 124;  visibility error
	}

}
