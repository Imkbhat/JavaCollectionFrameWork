package com.collection.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCheck {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		ListIterator<Integer> it = intList.listIterator();
		
		while(it.hasNext()) {
			Integer item = it.next();
			System.out.println("Elements through hasNext() and next() "+item);
		}
		
		while(it.hasPrevious()) {
			Integer item = it.previous();
			System.out.println("Elements through hasPrevious() and previous() "+item);
		}
		
		//Output
		/**
		 * 
		 *  Elements through hasNext() and next() 1
		    Elements through hasNext() and next() 2
		    Elements through hasNext() and next() 3
			Elements through hasNext() and next() 4
			Elements through hasNext() and next() 5
			Elements through hasPrevious() and previous() 5
			Elements through hasPrevious() and previous() 4
			Elements through hasPrevious() and previous() 3
			Elements through hasPrevious() and previous() 2
			Elements through hasPrevious() and previous() 1

		 */
	}

}
