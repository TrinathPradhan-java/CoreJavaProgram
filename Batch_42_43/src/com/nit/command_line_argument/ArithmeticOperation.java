package com.nit.command_line_argument;

class Calculate{
	public static int getSquareofNumber(int x) {
		return x*x;
	}
	public static int getCubeofNumber(int y) {
		return y*y*y;
		
	}
	
	public static int doSum(int x, int y) {
		return x+y;
	}
	public static int getSqureOfNumber(int i) {
		
		return 0;
	}
}





public class ArithmeticOperation {

	public static void main(String[] args) {
		int result = Calculate.getSquareofNumber(9);
		System.out.println("Square is :"+result);
		
		result =   Calculate.getCubeofNumber(3);  
		System.out.println("Cube is :"+result);
		
		result =  Calculate.doSum(12, 12);
		System.out.println("Sum is :"+result);

	}

}
