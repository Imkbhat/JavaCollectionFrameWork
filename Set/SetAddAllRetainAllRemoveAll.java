package com.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetAddAllRetainAllRemoveAll {

	public static void main(String[] args) {
		
		Set<Integer> aSet = new HashSet<>();
		aSet.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
		Set<Integer> bSet = new HashSet<>();
		bSet.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,7,5}));
		
		//Union
		Set<Integer> unionSet = new HashSet<Integer>(aSet);
		unionSet.addAll(bSet);
		System.out.println("UnionSet after AddAll ==>"+unionSet);
		
		//Intersection
		Set<Integer> intersectionSet = new HashSet<>(aSet);
		intersectionSet.retainAll(bSet);
		System.out.println("IntersectionSet after retainAll ==>"+intersectionSet);
		
		//difference
		Set<Integer> differenceSet = new HashSet<>(aSet);
		differenceSet.removeAll(bSet);
		System.out.println("Difference Set after removeAll ==>"+differenceSet);
	}

}
