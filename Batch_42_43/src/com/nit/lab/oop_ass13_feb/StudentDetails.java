package com.nit.lab.oop_ass13_feb;

public class StudentDetails {

	public static void main(String[] args) {
		Student scott = new Student();
		scott.setStudentDetails(101,"Mr.Scott",65);
		scott.gradeSheet();
		System.out.println(scott.getStudentData());

	}

}
