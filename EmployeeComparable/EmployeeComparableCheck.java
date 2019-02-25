package com.comparable;

import java.util.Arrays;

public class EmployeeComparableCheck {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[4];
		
		emp[0] = new Employee(1, "Kiran", 28);
		emp[1] = new Employee(2, "Arun", 29);
		emp[2] = new Employee(3, "Bhat",  28);
		emp[3] = new Employee(4, "Karthik", 29);
		
		Arrays.sort(emp);
		System.out.println("Default Sorting ==> "+Arrays.toString(emp));
		
		Arrays.sort(emp, Employee.idComparator);
		System.out.println("Sorting by Id ==>"+Arrays.toString(emp));
		
		Arrays.sort(emp, Employee.ageComparator);
		System.out.println("Sorting by Age ==>"+Arrays.toString(emp));
		
		Arrays.sort(emp, Employee.nameComparator);
		System.out.println("Sorting by Name ==>"+Arrays.toString(emp));
		
		/*
		 * Default Sorting ==> [Employee [id=1, name=Kiran, age=28], Employee [id=2, name=Arun, age=29], Employee [id=3, name=Bhat, age=28], Employee [id=4, name=Karthik, age=29]]
Sorting by Id ==>[Employee [id=1, name=Kiran, age=28], Employee [id=2, name=Arun, age=29], Employee [id=3, name=Bhat, age=28], Employee [id=4, name=Karthik, age=29]]
Sorting by Age ==>[Employee [id=1, name=Kiran, age=28], Employee [id=3, name=Bhat, age=28], Employee [id=2, name=Arun, age=29], Employee [id=4, name=Karthik, age=29]]
Sorting by Name ==>[Employee [id=2, name=Arun, age=29], Employee [id=3, name=Bhat, age=28], Employee [id=4, name=Karthik, age=29], Employee [id=1, name=Kiran, age=28]]

		 */
	}

}
