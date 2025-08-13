package com.nit.lab.abstracts;

import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] scienceStudents = null; // Declare array globally
        Student[] historyStudent = null;

        System.out.println("1 - Science Stream");
        System.out.println("2 - History Stream \n");
        System.out.print("Enter Your Stream: ");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter how many students: ");
                int n = sc.nextInt();
                scienceStudents = new ScienceStudent[n]; // Initialize array
                
                for (int i = 0; i < n; i++) { // Fix loop condition
                    sc.nextLine(); // Consume newline
                    System.out.println("\nScience Student Details for Student " + (i + 1));

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Class: ");
                    String studentClass = sc.nextLine();

                    System.out.print("Enter Physics Marks: ");
                    int physicMark = sc.nextInt();

                    System.out.print("Enter Chemistry Marks: ");
                    int chemistryMark = sc.nextInt();

                    System.out.print("Enter Math Marks: ");
                    int mathMark = sc.nextInt();

                    // Store ScienceStudent object in array
                    scienceStudents[i] = new ScienceStudent(name, studentClass, physicMark, chemistryMark, mathMark);
                }

                // Print student details
                System.out.println("\n===== Science Students Details and Percentages =====");
                for (Student s2 : scienceStudents) {
                    if (s2 != null) { // Fix: Check before accessing
                        System.out.println("Name: " + s2.studentName);
                        System.out.println("Class: " + s2.studentClass);
                        System.out.println("Percentage: " + s2.getPercentage() + "%\n");
                    }
                }
                break;
                
            case 2:
            	System.out.print("Enter how many students: ");
                int m = sc.nextInt();
                historyStudent = new HistoryStudent[m]; // Initialize array
                
                for (int i = 0; i < m; i++) { // Fix loop condition
                    sc.nextLine(); // Consume newline
                    System.out.println("\nScience Student Details for Student " + (i + 1));

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Class: ");
                    String studentClass = sc.nextLine();

                    System.out.print("Enter Physics Marks: ");
                    int historyMarks = sc.nextInt();

                    System.out.print("Enter Chemistry Marks: ");
                    int civilsMarks = sc.nextInt();

                   

                    // Store ScienceStudent object in array
                    historyStudent[i] = new HistoryStudent(name, studentClass,historyMarks,civilsMarks );
                }

                // Print student details
                System.out.println("\n===== Science Students Details and Percentages =====");
                for (Student s3 :historyStudent ) {
                    if (s3 != null) { // Fix: Check before accessing
                        System.out.println("Name: " + s3.studentName);
                        System.out.println("Class: " + s3.studentClass);
                        System.out.println("Percentage: " + s3.getPercentage() + "%\n");
                    }
                }
            	

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
