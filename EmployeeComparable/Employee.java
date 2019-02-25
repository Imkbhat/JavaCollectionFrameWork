package com.comparable;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private int age;
	
	public Employee() {
	
	}

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}
	
	public static Comparator<Employee> idComparator 
			= new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					return o1.id - o2.id;
				}
			};
			
	public static Comparator<Employee> nameComparator 
			= new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					return o1.name.compareTo(o2.name);
				}
			};
	
	public static Comparator<Employee> ageComparator
			= new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					return o1.age -o2.age;
				}
			};
}
