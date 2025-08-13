package pratice.short21_mar;

import java.util.Scanner;

public class StudentTester
{
	private static final ScienceStudent[] Student = null;

	public static void main(String[] args)
	{
		
		Student s1 = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Science Strem");
		System.out.println("2- History Streem \n ");
		System.out.println("Enter Your Streem.... ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter how meny Student");
			int n = sc.nextInt();
			 Student[] scienceStudents = new ScienceStudent[n];
			 for (int i = 0; i < n; i++) {
				 sc.nextLine();
				    System.out.println("Science Student Details for Student " + (i + 1));
				    System.out.println("Enter Student Name");
				    String name = sc.nextLine();

				    System.out.println("Enter Student Class");
				    String studentClass = sc.nextLine();

				    System.out.println("Enter physicMark");
				    int physicMark = sc.nextInt();

				    System.out.println("Enter chemestryMark");
				    int chemestryMark = sc.nextInt();

				    System.out.println("Enter mathMark");
				    int mathMark = sc.nextInt();
				    sc.nextLine(); // Consume the leftover newline

				    // Store ScienceStudent object in the array
				    scienceStudents[i] = new ScienceStudent(name, studentClass, physicMark, chemestryMark, mathMark);
				    System.out.println("\n===== Science Students Details and Percentages =====");
					for (Student s2 : scienceStudents) {
					    System.out.println("Name: " + s2.studentName);
					    System.out.println("Class: " + s2.studentClass);
					    System.out.println("Percentage: " + s2.getPercentage() + "%\n");
					}
				}
			 
			break; 
		
			
		}
		
		
	}

}
