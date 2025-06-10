package com.Daily.Task4;

public class ArrayReverse {
public static void main(String[] args) {
	/*Q2. Array Reverse: Write a program
	 *  that reverses the elements 
	 *  in an integer array.
	 */
	int[] normalArr = {1,2,3,4,5,5};
	int lengthy = normalArr.length;
	int[] reverseArr = new int[lengthy];
	
	int j=0;
	for(int i=lengthy-1;i>=0;i--) {
		reverseArr[j]= normalArr[i];
		j++;
	}
	for(int a:reverseArr) {
		System.out.print(a+ " ");
	}
}
}

