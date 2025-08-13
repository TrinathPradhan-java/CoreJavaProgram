package com.nit.lab.polymorphism;
import java.util.Scanner;
public class CalculateShape {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeCalculator shapeCalc = new ShapeCalculator();
        System.out.print("Enter choise [1/2/3]:");
        int ch = scanner.nextInt();
         if(ch ==1) {
       
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = shapeCalc.calculateArea(radius);
        if (circleArea != -1) {
            System.out.println("Area of circle with radius " + radius + ": " + circleArea);
        }
         }
         
         else if(ch==2) {
       
        System.out.print("Enter side length of the square: ");
        int sideLength = scanner.nextInt();
        
        int squareArea = shapeCalc.calculateArea(sideLength);
        if (squareArea != -1) {
            System.out.println("Area of square with side " + sideLength + ": " + squareArea);
        }
         }
         
         else if(ch==3) {
      
        System.out.print("Enter length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter width of the rectangle: ");
        int width = scanner.nextInt();
        int rectangleArea = shapeCalc.calculateArea(length, width);
        if (rectangleArea != -1) {
            System.out.println("Area of rectangle with length " + length + " and width " + width + ": " + rectangleArea);
        }
         }

        scanner.close();
    }


}
