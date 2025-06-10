package com.Daily.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPalindrome {
public static void main(String[] args) {
	/*Q4. ArrayList Palindrome: Determine if an ArrayList 
	 * of characters forms a palindrome 
	 * (reads the same forwards and backward). 
	 * You may use an Integer or String ArrayList.
	 */
	List<Integer> realAL = new ArrayList<>();
	realAL.add(1);
	realAL.add(2);
	realAL.add(1);
	List<Integer> dupeAL = new ArrayList<>(realAL);
	Collections.reverse(realAL);
	System.out.println(dupeAL.equals(realAL));
}
}
