package com.nit.lab.Exception.exception21_04;


public class CarTest {
//car is same with stop then will create exception object then did not any exception else block will execute
 public static void stop(String reason) throws CarStoppedException {
     if (reason=="stop") {
         throw new CarStoppedException("Car stopped for some reason.");
     } else {
         System.out.println("Car not stalled.");
     }
 }
//car is same with stop then will create exception object then did not any exception else block will execute
 public static void puncture(String condition) throws CarPuncture {
     if (condition=="puncture") {
         throw new CarPuncture("Car is punctured.");
     } else {
         System.out.println("Car not punctured.");
     }
 }
//car is same with temperature then will create exception object then did not any exception else block will execute
 public static void carHeat(int temperature) throws CarHeat {
     if (temperature > 50) {
         throw new CarHeat("Car is heated more than 50 degrees Celsius.");
     } else {
         System.out.println("Car temperature normal.");
     }
 }
}

