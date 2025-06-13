package com.Daily.Task5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadingFile {
public static void main(String[] args) {
	/*
	 * Q1. File Reading: Write a Java program 
	 * that reads the contents of a text file and 
	 * displays them on the console.
	 */
	try{
		File newFile = new File("C:\\Users\\RSharvesh\\Downloads\\employees.txt");
		BufferedReader br = new BufferedReader(new FileReader(newFile));
		String line;
		while(null!=(line = br.readLine())) {
			System.out.println(line);
		}
		br.close();
	}
	catch(Exception e) {
		e.getMessage();
	}
	
}
}
