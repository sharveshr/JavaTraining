package com.Training.dayFour;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] firstString = new String[10];
		firstString[0] = "first";
		firstString[1] = "second";
		firstString[2] = "third";
		firstString[3] = "fourth";
		firstString[4] = "fifth";
		firstString[5] = "sixth";
		
		Object string1;
		for(String string11 : firstString) {
			System.out.println(string11);
		}
		//
		System.out.println(firstString); // prints reference
		System.out.println(firstString.length);
		System.out.println(firstString[-1]);
		
		String[] color = new String[] {"Red","Blue","Yellow"};
		System.out.println(color[1]);
		
		
	}
	

}
