/**
 * 
 */
package com.Training.dayThree;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */
public class DateTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat timeDetails = new SimpleDateFormat("dd - MMM - yyyy HH:mm:ss");
		System.out.println(timeDetails.format(new Date()));

	}
}
