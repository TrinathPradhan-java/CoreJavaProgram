package com.nit.lab.ass_mar7;
import java.util.Scanner;

public class EmployeeSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Id ");
		int id = sc.nextInt();
		
		System.out.print("Enter Employee Name ");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter Employee Salary ");
        double salary = sc.nextDouble();
       
      
      if(salary<=0)
      {
    	  System.err.println("Invalid salary ");
      }
      else if(id<=0)
      {
    	System.err.println("In valid id");  
      }
      else if(name.trim().isEmpty()) {
    	  System.err.println("Invalid name");
      }
      else {
        PermanentEmployee pm = new PermanentEmployee(id, name, salary);
      //  pm.setProvidentfund();//out Side of method then call ,within a constructor then method are called toString. 
        System.out.println(pm);
        pm.netSalary();
        
       
       
        
        	
      
      System.out.print("Enter Employee Id ");
		int cid = sc.nextInt();
		
		System.out.print("Enter Employee Name ");
      String cname = sc.nextLine();
      name = sc.nextLine();
      System.out.print("Enter Employee Salary ");
      double csalary = sc.nextDouble();
      
      System.out.print("Enter Duration of Contract");
      int contract = sc.nextInt();
     
     
    	  ContractEmployee cm = new ContractEmployee(cid, cname, csalary, contract);
    	  System.out.println(cm);
      
      }
      
    }
        
       
      
	}



