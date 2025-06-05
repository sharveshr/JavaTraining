/**
 * 
 */
package com.Training.dayThree;

/**
 * 
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			String message = "Heoeh";
		message = message.toLowerCase();
		StringBuffer buff = new StringBuffer(message);
		String reverse = buff.reverse().toString();
		if(message.equals(reverse)) {
			System.out.println("It is a palindrome!");
		}
		else {
			System.out.println("it is not a palindrome :(");
		}
		}
		catch(Exception e) {
			e.getMessage();
		}

	}

}
