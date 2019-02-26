package com.removeduplicates.approches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesInListUsingContains {
	
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
		ArrayList<T> newList = new ArrayList<>();
		
		for (T item : list) {
			if(!newList.contains(item)){
				newList.add(item);
			}
		}
		return newList;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>( 
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		
		List<Integer> newList = removeDuplicates(list);
		
		System.out.println(newList);
	}

}
