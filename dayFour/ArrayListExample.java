package com.Training.dayFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<Integer> arList = new ArrayList<Integer>();
	arList.add(0,1);//adds at index 0 cannot add directly at index 4 in the beginning
	arList.addFirst(2);
	arList.addLast(3);
	arList.add(4);
	arList.add(0,4);//adds 4 at index 0 and pushes 0th index element to 1st index
	arList.remove(2);//removes 3rd index
	System.out.println(arList.contains(4));//true
	ArrayList<Integer> arListcopy = new ArrayList<Integer>(Arrays.asList(2,1,3,4));
	arList.containsAll(arListcopy);
	ArrayList<Integer> arListcopy2 =  new ArrayList<Integer>();
	arListcopy2 = (ArrayList<Integer>) arList.clone();
	System.out.println(arListcopy2.equals(arList));//true
	arListcopy.removeLast();
	//using iterator
	Iterator<Integer> it = arList.iterator();
		while(it.hasNext()) {
			Integer numbers = it.next();
			System.out.println(numbers);
		}
	//using for loop
	System.out.println("--------");
	for(Integer i: arList) {
		System.out.println(i);
	}
	
	arList.clear();//deletes all from arraylist
	
	