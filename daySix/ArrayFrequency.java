package com.Daily.Task4;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {
public static void main(String[] args) {
	/*Q1. Array Element Frequency: 
	 * Calculate the frequency
	 *  of each element in an array and display the results*/
	int[] arrayOne = {1,2,3,1,2,3,1,1,1,1,1,1,4};
	Map<Integer, Integer> frequencyMap = new HashMap<>();
	for(int num:arrayOne) {
		frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
	}
	for(Map.Entry<Integer,Integer>entry:frequencyMap.entrySet()) {
		System.out.println("Element: "+ entry.getKey()+ " Frequency: " + entry.getValue()+" times");
	}
	
}
}
