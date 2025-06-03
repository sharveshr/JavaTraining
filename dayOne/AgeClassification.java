/**
 * 
 */
package com.Training.dayOne;
import java.util.*;

/**
 * 
 */
public class AgeClassification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age bro: ");
		int age = sc.nextInt();
		sc.close();
		if(age<16) {
			System.out.println("Watch kids channel");
		}
		else if(age<18) {
			System.out.println("Can go to the movies now!");
		}
		else {
			System.out.println("Can drive, vote, get married");
		}

	}

}
