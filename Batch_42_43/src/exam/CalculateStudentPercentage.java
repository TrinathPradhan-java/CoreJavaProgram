package exam;
import java.util.Scanner;

public class CalculateStudentPercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter choise 1 or 2: ");
		int ch = sc.nextInt();
		if(ch==1) {
			
			System.out.print("enter name : ");
			String name = sc.nextLine();
			 name = sc.nextLine();
			System.out.print("enter rollNumber: ");
			int roll = sc.nextInt();
			System.out.print("enter Math: ");
			int math = sc.nextInt();
			System.out.print("enter Physics: ");
			int physics = sc.nextInt();
			System.out.print("enter chemistry: ");
			int chemistry = sc.nextInt();
			System.out.println("--------------------------------------------------------------------------");
			
			if(roll<=0) {
				System.out.println("Invalid roll");
			}
			else if(math<=0 && physics<=0 && chemistry <=0) {
				System.out.println("Invalid mark");
			}
			else if(name.trim().isEmpty()) {
				System.out.println("name is invalid");
			}
			else {
			if(math <=25 && physics <=25 && chemistry <=25) {
				System.out.println("Fail the reuslt will not show");
			}
			else {
		SceinceStudent scc = new SceinceStudent(name,roll,math,physics,chemistry);
		scc.displayDetails();
		System.out.println("You are a Science Student");
			}
		}
		}
		
		else if(ch==2) {
			System.out.print("enter name : ");
			String name = sc.nextLine();
			 name = sc.nextLine();
			System.out.print("enter rollNumber: ");
			int roll = sc.nextInt();
			System.out.print("enter geography: ");
			int geography = sc.nextInt();
			System.out.print("enter history: ");
			int history = sc.nextInt();
			System.out.print("enter english: ");
			int english = sc.nextInt();
			System.out.println("--------------------------------------------------------------------------");
			
			if(roll<=0) {
				System.out.println("Invalid roll");
			}
			else if(geography<=0 && history<=0 && english <=0) {
				System.out.println("Invalid mark");
			}
			else if(name.trim().isEmpty()){
				System.out.println("name is invalid");
			}
			else {
			if(geography <=25 && history <=25 && english <=25) {
				System.out.println("Fail the reuslt will not show");
			}
			else {
				ArtsStudent ac = new ArtsStudent(name,roll,geography,history,english);
		ac.displayDetails();
		System.out.println("You are a Arts Student");
			}
		}

	}

	}
}
