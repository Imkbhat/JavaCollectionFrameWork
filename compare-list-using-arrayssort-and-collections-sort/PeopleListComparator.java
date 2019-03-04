package com.comparing.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeopleListComparator {

	public static void main(String[] args) {
		
		List<People> person = new ArrayList<>();
		person.add(new People("Kiran", 28));
		person.add(new People("Karthik", 29));
		person.add(new People("Kavya", 24));
		person.add(new People("Koushik", 22));
		person.add(new People("Lakshmi", 24));
		person.add(new People("Amoolya", 14));
		person.add(new People("Ananya",8));
		
		
		
		System.out.println("List<People> before sort =======> "+person);
		
		// Sort People by their Age
		person.sort((person1, person2) -> {
			return person1.getAge() - person2.getAge();
		});
		
		// A more concise way of writing the above sorting function
		person.sort(Comparator.comparingInt(People::getAge));
		
		System.out.println("Comparing people by their Age ===> "+person);
		
		
		//Comparing by Name
		Collections.sort(person, Comparator.comparing(People::getName));
		
		System.out.println("Comparing using Collections.sort based on name:==>  " +person);
		
	}

}
