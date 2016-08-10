package com.capgemini.model;

public class Student {
	
	private int rollNumber;
	private String name;
	private String[] courseName;
	
	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getCourseName() {
		return courseName;
	}
	public void setCourseName(String[] courseName) {
		this.courseName = courseName;
	}
	

}
