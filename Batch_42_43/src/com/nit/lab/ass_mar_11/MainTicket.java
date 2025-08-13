package com.nit.lab.ass_mar_11;

import java.util.Scanner;
public class MainTicket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int option=Integer.parseInt(sc.nextLine());
        if(option==1)
        {
        	
           String type=sc.nextLine();
            int seatNo=Integer.parseInt(sc.next());
            double price=Double.parseDouble(sc.next());
            boolean b=sc.nextBoolean();
                   

    //StudentTicket studentTicket = new StudentTicket(type, seatNo, price, b);
     System.out.println("\nStudent Ticket:");
          //studentTicket.display();

        }
        else if(option==2)
        {
             
            String type=sc.nextLine();
            int seatNo=Integer.parseInt(sc.nextLine());
            double price=Double.parseDouble(sc.nextLine());
            String Access=sc.next();
            //VIPTicket vipTicket = new VIPTicket(type, seatNo, price,Access);
            System.out.println("VIP Ticket:");
           // vipTicket.display();

        }
        else
        {
            System.out.println("invalid Ticket Type");
        }
    }
}