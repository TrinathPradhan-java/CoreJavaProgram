package com.nit.lab.Exception.exception21_04;


public class CarUser {
 public static void main(String[] args) {

     //handeling the stop method in main method
     try {
         CarTest.stop("stop");
     } catch (CarStoppedException e) {
         System.out.println(e.getMessage());
     }

    
     try {
         CarTest.stop("go");
     } catch (CarStoppedException e) {
         System.out.println(e.getMessage());
     }

     
     try {
         CarTest.puncture("puncture");
     } catch (CarPuncture e) {
         System.out.println(e.getMessage());
     }

     
     try {
         CarTest.puncture("move");
     } catch (CarPuncture e) {
         System.out.println(e.getMessage());
     }

     
     try {
         CarTest.carHeat(60);
     } catch (CarHeat e) {
         System.out.println(e.getMessage());
     }

     
     try {
         CarTest.carHeat(40);
     } catch (CarHeat e) {
         System.out.println(e.getMessage());
     }
 }
}



