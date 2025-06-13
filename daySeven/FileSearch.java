package com.Daily.Task5;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileSearch {
public static void main(String[] args) {
	try {
		String newFile = "C:\\Users\\RSharvesh\\Downloads\\employees.txt";
		String keyword = "employee";
		try(BufferedReader br = new BufferedReader(new FileReader(newFile))){
			String line;
			int linenumber=0;
			boolean found = false;
			
			while((line = br.readLine())!=null) {
				linenumber++;
				if(line.contains(keyword)) {
					System.out.println("Found at line "+linenumber+" "+line);
					found=true;
				}
			}
			if(!found) {
				System.out.println("Keyword not found in file");
			}
		}
	}
	catch(Exception e) {
		e.getMessage();
	}
}
}
