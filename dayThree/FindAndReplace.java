/**
 * 
 */
package com.Training.dayThree;

/**
 * 
 */
public class FindAndReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{//initial sentence
		String sentence = "Rome was built in a single day.";
		//word to find
		String word = "day";
		//word to be replaced with
		String replace = "year";
		//changing casing
		sentence = sentence.toLowerCase();
		word.toLowerCase();
		replace.toLowerCase();
		//logic
		if(sentence.contains(word)) {
			sentence = sentence.replace(word, replace);
			System.out.println("The updated sentence is: "+ sentence);
		}
		else {
			System.out.println("The word "+ word + " is not present in the sentence: "+sentence);
		}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
