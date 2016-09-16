package com.cg.main;

import com.cg.model.Student;

public class StudentSchedular {

	private Student[] students = new Student[10];
	private int counterStudent;

	public String addStudent(int rollNumber, String name, String[] courses) {

		students[counterStudent++] = new Student(rollNumber, name, courses);
		return "Student added successfully";

	}

	public void showAllStudents() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("Roll Number      |      Name      	|      Course");
		System.out.println("---------------------------------------------------------------");
		for (int i = 0; i < counterStudent; i++) {
			System.out.println(
					students[i].getRollNumber() + " 		 | 	" + String.format("%-10s", students[i].getName())
							+ " 	| 	" + String.join(",", students[i].getCourse()));
		}
		System.out.println("---------------------------------------------------------------");
	}

	public void showStudentByRollNumber(int rollNumber) {

		System.out.println("---------------------------------------------------------------");
		System.out.println("Roll Number      |      Name      	|      Course");
		System.out.println("---------------------------------------------------------------");
		for (int i = 0; i < counterStudent; i++) {
			if (rollNumber == students[i].getRollNumber()) {
				System.out.println(
						students[i].getRollNumber() + " 		 | 	" + String.format("%-10s", students[i].getName())
								+ " 	| 	" + String.join(",", students[i].getCourse()));
			}
		}
		System.out.println("---------------------------------------------------------------");

	}

	/*
	 * private void showStudent(int rollNumber){
	 * 
	 * System.out.println(
	 * "---------------------------------------------------------------");
	 * System.out.println("Roll Number      |      Name      	|      Course");
	 * System.out.println(
	 * "---------------------------------------------------------------");
	 * for(int i=0;i<counterStudent;i++) {
	 * if(rollNumber==students[i].getRollNumber()){
	 * System.out.println(students[i].getRollNumber()+ " 		 | 	"
	 * +String.format("%-10s", students[i].getName())+" 	| 	"
	 * +String.join(",", students[i].getCourse())); }else if(rollNumber ==
	 * 0){//Show All Records System.out.println(students[i].getRollNumber()+
	 * " 		 | 	"+String.format("%-10s", students[i].getName())+" 	| 	"
	 * +String.join(",", students[i].getCourse())); }else{ System.out.println(
	 * "No Record Found"); } } System.out.println(
	 * "---------------------------------------------------------------"); }
	 */

	public boolean isRollNumberPresent(int rollNumber) {
		for (int i = 0; i < counterStudent; i++) {
			if (rollNumber == students[i].getRollNumber()) {
				return true;
			}
		}
		return false;
	}

}
