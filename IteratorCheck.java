package com.collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorCheck {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		Iterator<Integer> it = intList.iterator();
		
		while(it.hasNext()) {
			Integer item = it.next();
			System.out.println(item);
		}
		
	}

}
