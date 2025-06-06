package com.Training.dayFour;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IOStream {
public static void main(String[] args) {
	try{
		File newFile = new File("C:\\Users\\RSharvesh\\OneDrive - Mastech Digital\\Desktop\\JAVA NOTES\\dayfive.txt");
	System.out.println(newFile.isFile());
	System.out.println(newFile.exists());
	//newFile.createNewFile();
	if(!newFile.exists()) {
		System.out.println(newFile.createNewFile());
	}
	//FileInputStream inputCode = new FileInputStream(newFile);
	//FileOutputStream outputCode = new FileOutputStream(newFile,true);
	//outputCode.write((new String))
	BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
	bw.write("hellow worldd!!\n");
	bw.write("hellow java!!\n");
	bw.newLine();
	bw.close();
	BufferedReader br = new BufferedReader(new FileReader(newFile));
	String line;
	while(null!= (line = br.readLine())) {
		System.out.println(line);
	}
	br.close();
	
	
	
	}
	catch(Exception e) {
	e.getMessage();
}
}}
