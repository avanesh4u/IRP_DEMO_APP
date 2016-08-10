package com.capgemini.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capgemini.service.StudentSchedular;

public class StudentMain {

	private static Scanner sc = new Scanner(System.in);
	private static StudentSchedular studSch = new StudentSchedular();

	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {

		int choice;

		while (true) {
			System.out.println("1.add student");
			System.out.println("2.show all students");
			System.out.println("3.exit");
			System.out.println("4.Add Course");
			System.out.println("5.show All Course");

			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addStudentDetails();
				break;

			case 2:
				showAllStudents();
				break;
			case 4:
				AddCourseDetails();
				break;

			case 5:
				showAllCourses();
				break;

			default:
				System.out.println("Sorry entered wrong choice");

			}

		}

	}

	private static void showAllCourses() {
		studSch.showAllCourses();

	}

	private static void AddCourseDetails() {
		System.out.println("Enter Course");
		String courseName = sc.next();

		System.out.println(studSch.addCourse(courseName));
		;
	}

	private static void showAllStudents() {
		studSch.showAllStudents();

	}

	private static void addStudentDetails() {
		System.out.println("Enter roll number");

		try {
			int rollNumber = sc.nextInt();

			System.out.println("Enter name");
			String name = sc.next();

			System.out.println(studSch.addStudent(rollNumber, name));

		} catch (InputMismatchException e) {

			System.err.println("Invalid Roll Number\n");
			sc.nextLine();
		}

	}

}
