package com.removeduplicates.approches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingLinkedHashSet {
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
		// Create a new LinkedHashSet 
        Set<T> set = new LinkedHashSet<>(); 
  
        // Add the elements to set 
        set.addAll(list); 
  
        // Clear the list 
        list.clear(); 
  
        // add the elements of set 
        // with no duplicates to the list 
        list.addAll(set); 
  
        // return the list 
        return list; 
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>( 
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		
		List<Integer> newList = removeDuplicates(list);
		
		System.out.println(newList);
	}

}
