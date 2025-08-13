package com.nit.lab.ass_feb_21;

import java.util.Scanner;

class Student {
    protected int studentId;
    protected String name;
    protected double examFee;

    public Student(int studentId, String name, double examFee) {
        if (studentId <= 0 || examFee <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.studentId = studentId;
        this.name = name;
        this.examFee = examFee;
    }

    public String displayDetails() {
        return "Student [name=" + name + ", studentId=" + studentId + ", examFee=" + examFee + "]";
    }

    public double payFee(double amount) {
        return amount - examFee;
    }

    @Override
    public String toString() {
        return displayDetails();
    }
}

class DayScholar extends Student {
    private double transportFee;

    public DayScholar(int studentId, String name, double examFee, double transportFee) {
        super(studentId, name, examFee);
        if (transportFee <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.transportFee = transportFee;
    }

    @Override
    public String displayDetails() {
        return "DayScholar [transportFee=" + transportFee + ", name=" + name + ", studentId=" + studentId + ", examFee=" + examFee + "]";
    }

    @Override
    public double payFee(double amount) {
        return amount - (examFee + transportFee);
    }
}

class Hosteller extends Student {
    private double hostelFee;

    public Hosteller(int studentId, String name, double examFee, double hostelFee) {
        super(studentId, name, examFee);
        if (hostelFee <= 0) {
            System.out.println("Error Invalid Input");
            System.exit(0);
        }
        this.hostelFee = hostelFee;
    }

    @Override
    public String displayDetails() {
        return "Hosteller [hostelFee=" + hostelFee + ", name=" + name + ", studentId=" + studentId + ", examFee=" + examFee + "]";
    }

    @Override
    public double payFee(double amount) {
        return amount - (examFee + hostelFee);
    }
}

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Exam Fee: ");
        double examFee = sc.nextDouble();
        
        System.out.print("Enter Type (1-Regular, 2-DayScholar, 3-Hosteller): ");
        int type = sc.nextInt();
        
        Student student = null;
        if (type == 1) {
            student = new Student(id, name, examFee);
        } else if (type == 2) {
            System.out.print("Enter Transport Fee: ");
            double transportFee = sc.nextDouble();
            student = new DayScholar(id, name, examFee, transportFee);
        } else if (type == 3) {
            System.out.print("Enter Hostel Fee: ");
            double hostelFee = sc.nextDouble();
            student = new Hosteller(id, name, examFee, hostelFee);
        } else {
            System.out.println("Invalid Type");
            System.exit(0);
        }
        
        System.out.println(student.displayDetails());
        
        System.out.print("Enter Amount Paid: ");
        double amount = sc.nextDouble();
        
        double remaining = student.payFee(amount);
        System.out.println("Remaining Amount: " + remaining);
        
        sc.close();
    }
}

