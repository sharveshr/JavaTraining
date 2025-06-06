package com.Training.dayFour;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFIle {
public static void main(String[] args) {
	try {
		File newFile = new File("C:\\Users\\RSharvesh\\OneDrive - Mastech Digital\\Desktop\\JAVA NOTES\\daysix.properties");
		Properties prop= new Properties();
		prop.setProperty("Heroes","Superman,Batman,ironMan,Spider");
		FileOutputStream fileOut = new FileOutputStream(newFile);
		prop.store(fileOut,"Lists the cartoon heroes");
		
		//store and load methods
		
	}
	catch(Exception e){
		e.getMessage();
	}
}
}
