package com.Training.dayFour;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File newFile = new File("C:\\Users\\RSharvesh\\OneDrive - Mastech Digital\\Desktop\\JAVA NOTES\\movies.properties");
		if(!newFile.exists()) {
			newFile.createNewFile();
		}
		Properties prop = new Properties();
		prop.setProperty("genres","action,romance,thriller,comedy,drama");
		prop.setProperty("rajini", "petta,linga,jailer,padayappa");
		FileOutputStream fos = new FileOutputStream(newFile);
		prop.store(fos,"Addded genres and rajini movies");
		FileInputStream fis = new FileInputStream(newFile);
		prop.load(fis);
		
		
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

}
