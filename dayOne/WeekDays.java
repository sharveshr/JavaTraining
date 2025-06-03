/**
 * 
 */
package com.Training.dayOne;
import java.util.*;
/**
 * 
 */
public class WeekDays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in the range 0-6");
		int day = sc.nextInt();
		sc.close();
		switch(day) {
		case 0:
			System.out.println("It is a Sunday! Enjoy your leave");
			break;
		case 1:
			System.out.println("It is a Monday. Go to work again bro");
			break;
		case 2:
			System.out.println("It is a Tuesday. Not even a Thursday. Not even a Wednesday for that matter.");
			break;
		case 3:
			System.out.println("Ah what a week. Captain its only Wednesday?!");
			break;
		case 4:
			System.out.println("Thursday... just one more day bro");
			break;
		case 5:
			System.out.println("Yay its Friday!!!!!!");
			break;
		case 6:
			System.out.println("Saturday bro go home");
			break;
		}

	}

}
