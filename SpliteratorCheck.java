package com.collection.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorCheck {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		Stream<Integer> stream = intList.stream();
		
		Spliterator<Integer> spliterator = stream.spliterator();
		
		// estimateSize method 
        System.out.println("estimate size : " + spliterator.estimateSize()); 
                  
        // getExactSizeIfKnown method 
        System.out.println("exact size : " + spliterator.getExactSizeIfKnown()); 
          
        // hasCharacteristics and characteristics method 
        System.out.println(spliterator.hasCharacteristics(spliterator.characteristics())); 
          
        System.out.println("Content of arraylist :"); 
        
        // forEachRemaining method     
        spliterator.forEachRemaining((n) -> System.out.println(n)); 
          
        // Obtaining another  Stream to the array list. 
        Stream<Integer> str1 = intList.stream(); 
        spliterator = str1.spliterator(); 
          
        // trySplit() method 
        Spliterator<Integer> splitr2 = spliterator.trySplit(); 
          
        // If splitr1 could be split, use splitr2 first. 
        if(splitr2 != null) { 
        System.out.println("Output from splitr2: "); 
        splitr2.forEachRemaining((n) -> System.out.println(n)); 
        } 
  
        // Now, use the splitr 
        System.out.println("\nOutput from splitr1: "); 
        spliterator.forEachRemaining((n) -> System.out.println(n)); 
	}
	
	/**
	 * 
	 * estimate size : 5
		exact size : 5
		true
		Content of arraylist :
		1
		2
		3
		4
		5
		Output from splitr2: 
		1
		2
		
		Output from splitr1: 
		3
		4
		5

	 */

}
