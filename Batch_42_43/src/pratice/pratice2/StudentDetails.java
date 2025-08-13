package pratice.pratice2;


import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for student details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        
        System.out.print("Enter Fee: ");
        double fee = scanner.nextDouble();
        
        // Creating a student object
        Student student1 = new Student(name, id, course, fee);
        
        System.out.print("Enter Student Average Marks: ");
        double average = scanner.nextDouble();
        
        // Setting average and calculating grade
        student1.setAverage(average);
        
        // Displaying student details
        student1.displayStudent();

        // Creating another student using copy constructor
        Student student2 = new Student(student1);
        System.out.println("\nCopied Student Details:");
        student2.displayStudent();

        scanner.close();
    }

}
