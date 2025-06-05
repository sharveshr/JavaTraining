package com.Training.dayThree;

public class ExtractSubstring {

	public static void main(String[] args) {
		try{
			//original word 
		String message = "Armenia";
		//index to be spliced
		String splicedMessage = message.substring(2, 5);
		System.out.println("The original word is "+ message + " and the spliced message is "+ splicedMessage);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
