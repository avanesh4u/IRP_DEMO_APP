package com.cg.main;

import java.util.Scanner;

import com.cg.constant.StudentConstant;

public class StudentAdmin {
	private static Scanner sc = new Scanner(System.in);
	private static StudentSchedular studSch = new StudentSchedular();

	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {

		int choice;

		while (true) {
			System.out.println(StudentConstant.ADD_STUDENT);
			System.out.println(StudentConstant.SHOW_ALL_STUDENT);
			System.out.println(StudentConstant.SEARCH_STUDENT_BY_ROLLNUMBER);
			System.out.println(StudentConstant.EXIT);

			System.out.println(StudentConstant.ENTER_CHOICE);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addStudentDetails();
				break;

			case 2:
				showAllStudents();
				break;

			case 3:
				searchStudentByRollNumber();
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println(StudentConstant.WRONG_CHOICE);

			}
		}

	}

	private static void searchStudentByRollNumber() {
		System.out.println(StudentConstant.ENTER_ROLLNUMBER);
		int rollNumber;
		while (true) {

			try {
				rollNumber = sc.nextInt();
				if (rollNumber > 0) {
					studSch.showStudentByRollNumber(rollNumber);
					break;
				} else {
					System.err.println(StudentConstant.ROLLNUMBER_GREATER_THAN_ZERO);
					System.out.println(StudentConstant.TRY_AGAIN);
				}
			} catch (Exception e) {
				System.err.println(StudentConstant.WRONG_INPUT);
				System.out.println(StudentConstant.TRY_AGAIN);
				sc.nextLine();
			}

		}

	}

	private static void showAllStudents() {
		studSch.showAllStudents();

	}

	private static void addStudentDetails() {
		System.out.println(StudentConstant.ENTER_ROLLNUMBER);

		int rollNumber;

		while (true) {

			try {

				rollNumber = sc.nextInt();
				if (rollNumber > 0) {
					if (!studSch.isRollNumberPresent(rollNumber)) {
						break;
					} else {
						System.out.println(StudentConstant.ROLLNUMBER_ALREADY_PRESENT);
					}

				} else {
					System.out.println(StudentConstant.ROLLNUMBER_GREATER_THAN_ZERO);
				}
			} catch (Exception e) {
				System.out.println(StudentConstant.WRONG_ROLLNUMBER);
				System.out.println(StudentConstant.TRY_AGAIN);
				sc.nextLine();
			}
		}

		System.out.println(StudentConstant.ENTER_NAME);
		String name = sc.next();
		name += sc.nextLine();

		System.out.println(StudentConstant.ENTER_COURSE);

		while (true) {
			int courses;
			try {
				courses = sc.nextInt();
				if (courses > 0) {
					String[] courseNames = new String[courses];
					for (int i = 0; i < courses; i++) {
						courseNames[i] = sc.next();
						sc.nextLine();

					}
					System.out.println(studSch.addStudent(rollNumber, name, courseNames));
					break;
				} else {
					System.out.println(StudentConstant.ROLLNUMBER_GREATER_THAN_ZERO);

				}
			} catch (Exception e) {
				System.out.println(StudentConstant.WRONG_INPUT);
				sc.nextLine();
			}
		}

	}

}
