package com.string;

//class should be final, hence we shouldn't allow class to inherit
public final class UserDefinedImmutableClass {

	public static void main(String[] args) {
		Student student  = new Student("Bhatt", 123);
		System.out.println("Name ==> "+student.getName());
		System.out.println("RegNo ==> "+student.getRegNo());
		
		//student.regNo = 124;  visibility error
	}

}
