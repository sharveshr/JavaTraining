package com.Training.dayFive;

import java.util.Date;

public class StudentDetails {
	private String firstName;
	private String lastName;
	private int age;
	private Date DOB;
	private Date DOJ;
	private String emailID;
	private char gender;
	private String courseName;
	private long phoneNumber;
	private String city;
	private String area;
	private float CGPA;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public float getCGPA() {
		return CGPA;
	}
	public void setCGPA(float cGPA) {
		CGPA = cGPA;
	}
	public String show() {
		return "The details are: " + "First Name: " + getFirstName() + "Last Name: " +getLastName()+"Age: "+ getAge() +"DOB: "+getDOB()+"DOJ: "+getDOJ()+"Email ID: "+getEmailID()+"Gender: "+getGender()
				+"Course Name: "+getCourseName() +"Phone Number: "+getPhoneNumber() + "City: "+getCity()+"Area: "+getArea()+"CGPA: "+getCGPA(); 
	}
	
	
}