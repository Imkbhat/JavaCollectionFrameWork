package com.collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ANotherWayOfIterating {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		
		//Using Iterator inside loop
		for (Iterator<Integer> it = intList.iterator() ; it.hasNext() ; ) {
			System.out.println("Element===> "+it.next());
		}
	}

}
