package com.nit.lab.polymorphism;
import java.util.Scanner;
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choise [1/2/3] :");
        int ch = sc.nextInt();
        if(ch==1)
        {
        System.out.println("Enter hours worked:");
        double hoursWorked = sc.nextDouble();
        System.out.println("Enter hourly rate:");
        double hourlyRate = sc.nextDouble();
        Employee hourlyEmployee = new Employee(hoursWorked, hourlyRate);
        System.out.println("Monthly salary of hourly employee: " + hourlyEmployee.calculateSalary());
        }
        else if(ch==2)
        {
        System.out.println("Enter annual salary:");
        double annualSalary = sc.nextDouble();
        Employee salariedEmployee = new Employee(annualSalary);
        System.out.println("Monthly salary of salaried employee: " + salariedEmployee.calculateSalary(annualSalary));

        }
        
        else if(ch==3) {
        System.out.println("Enter sales amount:");
        double salesAmount = sc.nextDouble();
        System.out.println("Enter commission rate :");
        double commissionRate = sc.nextDouble();
        Employee commissionEmployee = new Employee(salesAmount, (int) (commissionRate * 100));
        System.out.println("Commission of employee: " + commissionEmployee.calculateSalary(salesAmount, commissionRate));

        }
        sc.close();
    }
}
