package com.capgemini.service;

import com.capgemini.model.Student;

public class StudentSchedular {

	private Student[] students = new Student[10];
	private int counterStudent;
	private String[] courseName = new String[10];
	private int counterCourse;

	public String addStudent(int rollNumber, String name) {

		students[counterStudent++] = new Student(rollNumber, name);
		return "Student added successfully";

	}

	public void showAllStudents() {
		System.out.println("-----------------------------------");
		System.out.println("Roll Number 	|	 Name");

		for (int i = 0; i < counterStudent; i++) {
			System.out.println(students[i].getRollNumber() + "            		 " + students[i].getName());
		}

		System.out.println("-----------------------------------");
	}

	public String addCourse(String course) {

		courseName[counterCourse++] = course;

		return "Course added successfully";
	}

	public void showAllCourses() {
		System.out.println("-----------------------------------");
		System.out.println("Course Name");

		for (int i = 0; i < counterCourse; i++) {
			System.out.println(courseName[i]);

		}
		System.out.println("-----------------------------------");
	}
}
