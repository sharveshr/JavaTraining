package com.Training.dayFive;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.Training.dayFive.*;

public class StudentDataEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatDate = new SimpleDateFormat("ddMMYYYY");
		StudentDetails dataEntry = new StudentDetails();
		try {
			Scanner sc = new Scanner(System.in);
			float CGPA;
			String courseName;
			int cases;
			while(true) {
				System.out.println("Enter 0 for input, 1 to view, 2 to update CGPA and CourseName and 3 to EXIT");
				cases = sc.nextInt();
				sc.nextLine();
				switch(cases) {
				case 0:
					System.out.println("Enter your First Name:");
					String firstName = sc.nextLine();
					dataEntry.setFirstName(firstName);
					System.out.println("Enter your Last Name:");
					String lastName = sc.nextLine();
					dataEntry.setLastName(lastName);
					System.out.println("Enter your Age:");
					int age = sc.nextInt();
					sc.nextLine();
					dataEntry.setAge(age);
					System.out.println("Enter your Email ID:");
					String emailID = sc.nextLine();
					dataEntry.setEmailID(emailID);
					System.out.println("Enter your Gender:");
					char gender = sc.nextLine().charAt(0);
					dataEntry.setGender(gender);
					System.out.println("Enter your Date of Birth:");
					Date DOB = formatDate.parse(sc.nextLine());
					dataEntry.setDOB(DOB);
					System.out.println("Enter your Date of Joining:");
					Date DOJ = formatDate.parse(sc.nextLine());
					dataEntry.setDOJ(DOJ);
					System.out.println("Enter your Phone Number: ");
					long phoneNumber = sc.nextLong();
					sc.nextLine();
					dataEntry.setPhoneNumber(phoneNumber);
					System.out.println("Enter your city: ");
					String city = sc.nextLine();
					dataEntry.setCity(city);
					System.out.println("Enter your area: ");
					String area = sc.nextLine();
					dataEntry.setArea(area);
					System.out.println("Enter your Course Name: ");
					courseName = sc.nextLine();
					dataEntry.setCourseName(courseName);
					System.out.println("Enter your CGPA: ");
					CGPA = sc.nextFloat();
					sc.nextLine();
					dataEntry.setCGPA(CGPA);
					break;
				case 1:
					System.out.println("First Name: " + dataEntry.getFirstName());
					System.out.println("Last Name: " + dataEntry.getLastName());
					System.out.println("Age: " + dataEntry.getAge());
					System.out.println("Email ID: " + dataEntry.getEmailID());
					System.out.println("Gender: " + dataEntry.getGender());
					System.out.println("DOB: " + dataEntry.getDOB());
					System.out.println("DOJ: " + dataEntry.getDOJ());
					System.out.println("Phone Number: " + dataEntry.getPhoneNumber());
					System.out.println("City: " + dataEntry.getCity());
					System.out.println("Area: " + dataEntry.getArea());
					System.out.println("Course Name: " + dataEntry.getCourseName());
					System.out.println("CGPA: " + dataEntry.getCGPA());
					//dataEntry.show();
					break;
				case 2:
					System.out.println("Enter updated Course Name: ");
					courseName= sc.nextLine();
					dataEntry.setCourseName(courseName);
					System.out.println("Enter updated CGPA: ");
					CGPA= sc.nextFloat();
					dataEntry.setCGPA(CGPA);
					break;
				default:
					return;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
