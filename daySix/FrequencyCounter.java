package com.Daily.Task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class FrequencyCounter {
	public static void main(String[] args) {
		/*
		 * Q7. Frequency Counter: Write a Java program that counts the frequency of
		 * elements in a list using a HashMap and stores the results in the map.
		 */
		List<Integer> stackOne =  new Stack<>();
		Map<Integer,Integer> freq = new HashMap<>();
		stackOne.add(1);
		stackOne.add(2);
		stackOne.add(3);
		stackOne.add(5);
		for(int i:stackOne) {
			freq.put(i, freq.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer,Integer> sample : freq.entrySet()) {
			System.out.println("Element: "+ sample.getKey() + " value : " + sample.getValue());
		}
	}
}
