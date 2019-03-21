package com.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Merge2SetsByUserDefinedMethod {
	
	
	private static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {
		Set<T> mergedSet = new HashSet<>();
		mergedSet.addAll(a);
		mergedSet.addAll(b);
		return mergedSet;
	}

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<>();
		a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
				
		Set<Integer> b = new HashSet<>();
		b.addAll(Arrays.asList(new Integer[] {1,3,2,5,7,8,9}));
		
		System.out.println("A Set=> "+a);
		System.out.println("B Set=> "+b);
		
		Set<Integer> hashi = mergeSet(a, b);
		
		System.out.println("HashiSet Set=> "+hashi);
	}

}
