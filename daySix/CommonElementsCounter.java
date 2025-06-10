package com.Daily.Task4;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsCounter {
public static void main(String[] args) {
	/*Q8. Common Elements Counter: 
	 * Given an array and a HashSet of elements, 
	 * count how many elements in the array are also 
	 * present in the HashSet.
	 */
	int[] arrayOne = {1,2,3,4,4,5,5,6};
	Set<Integer> hash = new HashSet<>();
	hash.add(1);
	hash.add(2);
	hash.add(3);
	hash.add(3);
	hash.add(3);
	hash.add(6);
	int count=0;
	for(int a : arrayOne) {
		if(hash.contains(a)){
			count++;
		}
	}
	System.out.println(count);
}
}
