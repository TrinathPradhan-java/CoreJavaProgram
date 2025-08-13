package com.nit.lab.oop_ass13_feb;

public class Student {
    int rollNumber;
    String studentName;
    double studentMark;
    char studentGrade;

    // Method to set student details
    public void setStudentDetails(int roll, String name, double mark) {
        rollNumber = roll;
        studentName = name;
        studentMark = mark;
    }

    // Method to assign grades based on marks
    public void gradeSheet() {
        if (studentMark >= 90) {
            studentGrade = 'A';
        } else if (studentMark >= 81) {  // Changed condition
            studentGrade = 'B';
        } else if (studentMark >= 71) {  // Changed condition
            studentGrade = 'C';
        } else if (studentMark >= 61) {  // Changed condition
            studentGrade = 'D';
        } else {
            studentGrade = 'E';  // Any mark below 61 gets 'E'
        }
    }

    
    public String getStudentData() {
        return "[Roll: " + rollNumber + ", Name: " + studentName + ", Mark: " + studentMark + ", Grade: " + studentGrade + "]";
    }
}
